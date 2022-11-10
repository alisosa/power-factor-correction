package com.ucu.PowerCorrection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PowerCorrectionApplication {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println("EJ PPT ");
		calculator.calculateC(12000.0, 0.69, 12500.0);

		System.out.println("EJ CLASE ");
		calculator.calculateC(5200.0, 0.8, 3900.0);

		//Modo A: se prende 1,2,4,5,6,7 (Línea X y Z invierno)
		System.out.println("MODO A ");
		calculator.calculateC(559.86, 0.7, 570.64);
		//Modo B: se prende 1,3,4,5,6,7 (Línea Y y Z invierno)
		System.out.println("MODO B ");
		calculator.calculateC(709.56, 0.6, 950.83);
		//Modo C: se prende 1,3,4,6,7 (Línea Y y Z verano)
		System.out.println("MODO C ");
		calculator.calculateC(629.56, 0.55, 947.26);
		//Modo D: se prende 1,2,3,6,7 (Línea X y Y verano)
		System.out.println("MODO D ");
		calculator.calculateC(729.66, 0.66, 817.26);
		//Modo E: se prende 1,6 (Verano, solo oficinas)
		System.out.println("MODO E ");
		calculator.calculateC(139.96, 0.96, 35.27);
		//Modo F: se prende 3,6,7 (Línea Y nocturna verano)
		System.out.println("MODO F ");
		calculator.calculateC(479.66, 0.57, 677.2);
		//Modo G: se prende 2,5,6,7 (Línea X nocturna invierno)
		System.out.println("MODO G ");
		calculator.calculateC(409.96, 0.80, 300.58);
	}

}
