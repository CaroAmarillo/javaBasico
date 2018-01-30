package com.ejercicio7;

public class CuentaBancaria {
	String nDeCuenta;
	Cliente cliente;
	String banco;
	
	public CuentaBancaria(String nDeCuenta, String banco, Cliente cliente){
		this.nDeCuenta = nDeCuenta;
		this.banco = banco;
		this.cliente = cliente;
		
		cliente.getListadeCuentasBancarias().add(this);
	}
	
	public String getnDeCuenta() {
		return nDeCuenta;
	}

	public void setnDeCuenta(String nDeCuenta) {
		this.nDeCuenta = nDeCuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	
	
}
