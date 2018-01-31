package com.ejercicio8;

public class Perro extends Mascotas {
	private int aumentoDeAlimento;
	
	public Perro(String nom, float edad, float peso, int aumentoDeAlimento) {
		super(nom, edad, peso);
		this.aumentoDeAlimento = aumentoDeAlimento;
	}
	
	@Override
	public String accion() {
		return  "Me relaja ladrar!" + "Tu edad se disminuyo un 10%";
	}

	@Override
	public void comer(int alimentoIngerido) {
		
		alimentoIngerido += this.aumentoDeAlimento;
		System.out.println("Se ah aumentado el alimento ingerido a un %50");
		
	}
	
}