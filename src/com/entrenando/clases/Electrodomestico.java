package com.entrenando.clases;

public class Electrodomestico {

	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Constantes
	protected final static double PRECIO_BASE_DEF = 100;
	protected final static String COLOR_DEF = "blanco";
	protected final static char CONSUMOENER_DEF = 'F';
	protected final static double PESO_DEF = 5;
	
	
	//CONSTRUCTORES
	
	//Constructor por defecto
	public Electrodomestico () {
		this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMOENER_DEF, PESO_DEF);
	}
	
	//Constructor con precio y peso, el resto por defecto
	public Electrodomestico(double precioBase, double peso ) {
		this(precioBase, COLOR_DEF, CONSUMOENER_DEF, peso);
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	//Constructor completo
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}


	//GETTER
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	
	//Métodos personalizados
	
	public void comprobarConsumoEnergetico() {
		
		if(this.consumoEnergetico >= 65 && this.consumoEnergetico <= 70) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMOENER_DEF;
		}
	}
	
	private void comprobarColor() {
		
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		
		boolean encontrado = false;
		
		for(String color : colores) {
			
			if(color.equals(colores)) {
				this.color = color;
				encontrado = true;
			} else {
				this.color = COLOR_DEF;
				// this.color = encontrado? color: COLOR_DEF;
			}
		}
	}
	
	public double precioFinal() {
		
		double aumentoPrecio = 0.0;
		
		switch(consumoEnergetico) {
			case 'A':
				aumentoPrecio += 100;
				break;
			case 'B':
				aumentoPrecio += 80;
				break;
			case 'C':
				aumentoPrecio += 60;
				break;
			case 'D':
				aumentoPrecio += 50;
				break;
			case 'E':
				aumentoPrecio += 30;
				break;
			case 'F':
				aumentoPrecio += 10;
				break;
		}
		
		if(peso >= 0 && peso < 20) {
			aumentoPrecio += 10;
		} else if(peso >= 20 && peso <= 49) {
			aumentoPrecio += 50;
		} else if(peso >= 50 && peso <= 79) {
			aumentoPrecio += 80;
		} else if(peso > 80) {
			aumentoPrecio += 100;
		}
		
		return precioBase + aumentoPrecio;
	}

	
}

































