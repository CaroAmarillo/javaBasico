package com.ejercicio14;

public class Electrodomestico {
	
	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	//private ArrayList<colores> listaDeColoresDiponibles;
	//Datos por defecto
	/*private final String colorPorDefecto = "blanco";
	private final char consumoEnergeticoPorDefecto = 'F';
	private int precioBasePorBase = 100;
	private final double pesoPorDefecto = 5;*/
	//Constructor por defecto --->
	public Electrodomestico(){}
	
	public Electrodomestico(double peso, int precioBase){
		
		this.peso = peso;
		this.precioBase = precioBase;
		this.color = "Blanco";
		this.consumoEnergetico = 'F';		
	}
	
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public int getPrecioBase() {
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
	
	public void comprobarconsumoEnergrtico(char letra){
		
		
	}
	
	public void comprobarColor(){
		
	}
	
	public void precioFinal(){
		
	}
	
	
	
}
