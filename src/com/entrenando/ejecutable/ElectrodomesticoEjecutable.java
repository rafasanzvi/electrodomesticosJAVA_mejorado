package com.entrenando.ejecutable;

import com.entrenando.clases.Electrodomestico;
import com.entrenando.clases.Lavadora;
import com.entrenando.clases.Television;

public class ElectrodomesticoEjecutable {

	public static void main(String[] args) {
		
		Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];
		
		
		listaElectrodomesticos[0] = new Electrodomestico(100, "azul", 'A', 70);
		listaElectrodomesticos[1] = new Electrodomestico(200, "rojo", 'Z', 120);
		listaElectrodomesticos[2] = new Electrodomestico(230, " ", 'E', 60);
		listaElectrodomesticos[3] = new Electrodomestico(90, "violeta", 'A', 50);
		listaElectrodomesticos[4] = new Lavadora(100, "azul", 'A', 70, 7);
		listaElectrodomesticos[5] = new Lavadora(200, "rojo", 'Z', 120, 20);
		listaElectrodomesticos[6] = new Lavadora(230, " ", 'E', 60, 30);
		listaElectrodomesticos[7] = new Lavadora(90, "violeta", 'A', 50, 2);
		listaElectrodomesticos[8] = new Television(230, " ", 'E', 60, 30, true);
		listaElectrodomesticos[9] = new Television(90, "verda", 'A', 50, 10, false);
		
		
		double sumaElectrodomesticos = 0;
		double sumaTelevisores = 0;
		double sumaLavadoras = 0;
		
		for(int i = 0; i < listaElectrodomesticos.length; i++) {
			
			if(listaElectrodomesticos[i] instanceof Electrodomestico) {
				
				sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal(); 
			}
			if(listaElectrodomesticos[i] instanceof Lavadora) {
				sumaLavadoras += listaElectrodomesticos[i].precioFinal();
			}
			if(listaElectrodomesticos[i] instanceof Television) {
				sumaTelevisores += listaElectrodomesticos[i].precioFinal();
			}
		}

		System.out.println("La suma de todos los electrodomesticos es: " + sumaElectrodomesticos + "euros");
		System.out.println("La suma de todos las lavadoras es: " + sumaLavadoras + "euros");
		System.out.println("La suma de todos los  es televisores es: " + sumaTelevisores + "euros");
		
	}

}
