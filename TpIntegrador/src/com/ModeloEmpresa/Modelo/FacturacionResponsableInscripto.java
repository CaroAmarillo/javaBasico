package com.ModeloEmpresa.Modelo;

public class FacturacionResponsableInscripto implements ITipoFacturacion{

	@Override
	public void facturar(int cantidad, Producto unProducto, Cliente cli, double total) {
		System.out.println("El cliente " + cli.toString() + " ha comprado "
				+ cantidad + " de " + unProducto.toString() + " al costo de $"
				+ total + " mas IVA de $" + this.iva*total);
		}
		
}


