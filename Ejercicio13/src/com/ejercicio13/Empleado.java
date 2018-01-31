package com.ejercicio13;

public class Empleado extends Persona implements ICobrador {
	private int salarioHora;
	private int horasTrabajadas;
	
	public Empleado(String nombre, String cargo, int salarioHora, int horasTrabajadas) {
		super(nombre, cargo);
		this.salarioHora = salarioHora;
		this.horasTrabajadas = horasTrabajadas;
	}
	public int getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(int salarioHora) {
		this.salarioHora = salarioHora;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	@Override
	public void EmitirFactura() {
		
		System.out.println("Nombre: " + this.nombre + ", Cargo :" + this.cargo );
		
	}
	@Override
	public void calcularMontoFacturar(int montoFinal) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
