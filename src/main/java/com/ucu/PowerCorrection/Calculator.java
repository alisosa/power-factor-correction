package com.ucu.PowerCorrection;

import java.util.ArrayList;

public class Calculator{

    private static final Double w = 314.0;
    private static final Double tan_18 = 0.3287;
    private static final Double voltaje = 5000.0;
    private static final Double voltaje220 = 220.0;

    public ArrayList<Double> calculateC(Double potencia, Double fp, Double q){

        //Lista con rango de capacitores a retornar
        ArrayList<Double> result = new ArrayList();
        //angulo de S inicial (φ)
        double angle = Math.toDegrees(Math.acos(fp));

        //Altura de la max potencia compleja
        double h_max_q = potencia * tan_18;

        // Pot compleja minima que tengo que bajar
        double q_min_down = q - h_max_q;
        //Pot compleja max que tengo que bajar
        double q_max_down = q + h_max_q;
        //double q_max_down = qi + q_fp_095;
        //S = V.I*
        double i = q_min_down / voltaje;
        double imax = q_max_down / voltaje;

        double z = voltaje / i;
        double zmax = voltaje / imax;
        double c1 = 1 / (z * w);
        double c2 = 1 / (zmax * w);

        System.out.println(""+ c1 + " <= c <= " + c2);
        result.add(c1);
        result.add(c2);
        return result;
    }
}