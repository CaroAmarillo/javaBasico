package com.ejercicio18;

public class Cliente {

	private String nombre, apellido;
	private double deuda;
	private IFactura categoria;

	public Cliente(String nombre, String apellido, Boolean responsable) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.deuda = 0;

	}

	@Override
	public String toString() {
		return this.nombre +"\n"+ this.apellido;
	}

	public IFactura getCategoria() {
		return this.categoria;
	}

	public double getDeuda() {
		return this.deuda;
	}

	public void comprar(double gasto) {
		this.deuda += gasto;
	}
	public void pagarDeuda() {
		System.out.println("El cliente " + this.toString() + 
				"ha pagado su deuda de $" + this.deuda);
		this.deuda = 0;
	}
}