package com.ejercicio4;

public class Cafetera {
	
	private int capacidadMaxima;
	private int cantidadActual;
	
	public Cafetera() {
		
		capacidadMaxima = 1000;
		cantidadActual = 0;
		
	}
	
	public Cafetera(int cantidadActual){
		
		cantidadActual = capacidadMaxima ;
	}
	
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		
		if(cantidadActual > capacidadMaxima){
			capacidadMaxima = this.capacidadMaxima;
		}
		
	}
	
	
	public int llenarCafetera(){
		
		return this.cantidadActual = this.capacidadMaxima; 
				
	}
	
	public void servirTaza(int servir){
		
		if (this.cantidadActual < servir){
			
			servir = this.cantidadActual - servir;			
			
		}
	}
	
	public int vaciarCafetera(){
		return this.cantidadActual = 0;
	}
	
	public void agregarCafe(int cafeAgregado) {
		
		this.cantidadActual += cafeAgregado;
		
	}
}
