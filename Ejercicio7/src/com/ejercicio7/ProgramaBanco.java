package com.ejercicio7;

public class ProgramaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco banco = new Banco("Galicia");
		Cliente cliente1 = new Cliente("Pepe", banco);
		banco.mostrarListaDeClientes();
	}

}
