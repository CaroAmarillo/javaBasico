package com.ejercicio9;

public abstract class Persona {
	private String nombre, apellido;
	private int horasDeVuelo;
	
	public Persona(String nombre, String apellido, int horasDeVuelo){
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.horasDeVuelo = horasDeVuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	public int getHorasDeVuelo() {
		return horasDeVuelo;
	}

	public void setHorasDeVuelo(int horasDeVuelo) {
		this.horasDeVuelo = horasDeVuelo;
	}
	
	public abstract void premiar();
	
	public abstract void hablar();
}
