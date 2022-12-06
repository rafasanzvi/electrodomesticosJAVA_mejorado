package com.entrenando.clases;

public class Television extends Electrodomestico {

	//Atributos
	private int resolucion;
	private boolean sintonizadorTDT;
	
	//Atributos DEF
	protected final static int RESOLUCION_DEF = 20;
	protected final static boolean TDT_DEF = false;
	
	//CONSTRUCTORES
	public Television() {
		this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMOENER_DEF, PESO_DEF, RESOLUCION_DEF, TDT_DEF);
	}

	
	public Television(double precioBase, double peso) {
		this(precioBase, COLOR_DEF, CONSUMOENER_DEF, peso, RESOLUCION_DEF, TDT_DEF);
	}


	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sincronizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	//GETTER
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSincronizadorTDT() {
		return sintonizadorTDT;
	}


	//MÉTODOS PERSONALIZADOS
	public double precioFinal() {
		
		double aumentoPrecio = super.precioFinal();
		
		if(resolucion > 40) {
			aumentoPrecio = (precioBase*0.3);
		}
		if(sintonizadorTDT) {
			aumentoPrecio += 50;
		}
		return aumentoPrecio;
	}

	
	
	
	
}
