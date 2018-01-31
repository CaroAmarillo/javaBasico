package com.ejercicio9;

public class Pasajero extends Persona {
	
	private String cargo;

	public Pasajero(String nombre, String apellido, int horasDeVuelo, String cargo) {
		super(nombre, apellido, horasDeVuelo);
		this.cargo = cargo;
		
	}

	@Override		
	public void premiar() {
		if (this.getHorasDeVuelo() >= 100 && cargo == "Frecuente") {
			System.out.println("Felicitaciones ud. ha llegado/superado las 100 horas "
					+ "y al ser frecuente se le regala un pasaje a Miami");
		}else {
			System.out.println("Felicitaciones ud. ha llegado/superado las 100 horas  "
					+ "se le regala un pasaje a Brasil");
		}
	}
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}