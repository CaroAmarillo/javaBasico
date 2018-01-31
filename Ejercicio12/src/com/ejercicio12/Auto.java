package com.ejercicio12;

public class Auto {
	
	private int patente;
	private int kmRecorridos;
	private int kmIniciales;
	private int kmFinales;
	private boolean disponible;
	Vehiculo vehiculo;
	
	public Auto(int patente, int kmRecorridos, int kmIniciales, int kmFinales, boolean disponible, Vehiculo vehiculo) {
		this.patente = patente;
		this.kmRecorridos = kmRecorridos;
		this.kmIniciales = kmIniciales;
		this.kmFinales = kmFinales;
		this.disponible = disponible;
		this.vehiculo = vehiculo;
		
		//vehiculo.getListaVehiculos().add(this);
		
	}
	
	public int getPatente() {
		return patente;
	}
	public void setPatente(int patente) {
		this.patente = patente;
	}
	public int getKmRecorridos() {
		return kmRecorridos;
	}
	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	public int getKmIniciales() {
		return kmIniciales;
	}
	public void setKmIniciales(int kmIniciales) {
		this.kmIniciales = kmIniciales;
	}
	public int getKmFinales() {
		return kmFinales;
	}
	public void setKmFinales(int kmFinales) {
		this.kmFinales = kmFinales;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}