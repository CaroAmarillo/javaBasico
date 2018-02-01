package com.ejercicio18;

public class Cliente {

	private String _nombre, _apellido;
	private double _deuda;
	// salvo que aclare el cliente arranca como Consumidor final
	private IFactura _categoria;

	public Cliente(String nombre, String apellido, Boolean responsable) {
		this._nombre = nombre;
		this._apellido = apellido;
		this._deuda = 0;

	}


	@Override
	public String toString() {
		return this._nombre + " " + this._apellido;
	}

	public IFactura getCategoria() {
		return this._categoria;
	}

	public double getDeuda() {
		return this._deuda;
	}

	public void comprar(double gasto) {
		this._deuda += gasto;
	}

	public void pagarDeuda() {
		System.out.println("El cliente " + this.toString() + "ha cancelado su deuda de $" + this._deuda);
		this._deuda = 0;
	}
}