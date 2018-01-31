package com.ejercicio11;

public class Orden {
	private int numero;
	private String fecha, modeloPC,problema;
	Empresa empresa;
	
	public Orden(int numero, String fecha, String modeloPC, String problema, Empresa empresa) {
		this.numero = numero;
		this.fecha = fecha;
		this.modeloPC = modeloPC;
		this.problema = problema;
		this.empresa = empresa;
		
		empresa.getListaOrdenes().add(this);
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getModeloPC() {
		return modeloPC;
	}

	public void setModeloPC(String modeloPC) {
		this.modeloPC = modeloPC;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	
	
}
