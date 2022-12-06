package com.entrenando.clases;

public class Lavadora extends Electrodomestico {

	private int carga;
	
	protected final static int CARGA_DEF = 5;

	
	//Constructor por defecto
	public Lavadora () {
		this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMOENER_DEF, PESO_DEF, CARGA_DEF);
	}
	
	
	//Constructor con precio y peso
	public Lavadora(double precioBase, double peso) {
		this(precioBase, COLOR_DEF, CONSUMOENER_DEF, peso, CARGA_DEF);
		
	}
	

	//Constructor con todo
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	
	//GETTER
	public Lavadora(int carga) {
		super();
		this.carga = carga;
	}
	
	//Métodos personalizados
	
	public double precioFinal() {
		
		double aumentoPrecio = super.precioFinal();
		
		if(carga > 30) {
			aumentoPrecio += 50;
		}
		
		return aumentoPrecio;
	}
	


	


	
	
	
}
