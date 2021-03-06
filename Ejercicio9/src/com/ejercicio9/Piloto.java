package com.ejercicio9;

public class Piloto extends Persona {
	
	private String cargo;
	private boolean despegar;
	
	public Piloto(String nombre, String apellido, int horasDeVuelo, String cargo) {
		super(nombre, apellido, horasDeVuelo);
		this.cargo = cargo;
		
	}

	@Override
	public void premiar() {
		if (this.getHorasDeVuelo() > 30) {
			System.out.println("Felcitaciones ud. ha  llegado/superado las 30 horas de vuelo, "
					+ "tiene una semana de descanso");
		}else {
			System.out.println("Aun te faltan " + (30 - this.getHorasDeVuelo())
					+ "cantidad de horas para el premio");
		}
		
	}

	@Override
	public void hablar() {
		if (despegar) {
			System.out.println("Trupulación lista para despegar");			
		}else{
			System.out.println("Abrochense los cinturones");
		}
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
