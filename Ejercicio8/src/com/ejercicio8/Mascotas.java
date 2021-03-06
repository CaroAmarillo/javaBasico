package com.ejercicio8;

public abstract class Mascotas {
	private String nombre;
	private float edad, peso;
	
	public Mascotas(String nom, float edad, float peso){
		
		this.nombre = nom;
		this.edad = edad;
		this.peso = peso;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(float edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		
	}
	
	public abstract String accion();
	
	public abstract void comer(int alimentoIngerido);
}
