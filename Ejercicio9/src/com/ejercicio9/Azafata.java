package com.ejercicio9;

public class Azafata extends Persona{
		
		private String cargo;
		
		public Azafata(String nombre, String apellido, int horasDeVuelo, String cargo) {
			super(nombre, apellido, horasDeVuelo);
			this.cargo = cargo;
		}

		@Override
		public void premiar() {
			if (this.getHorasDeVuelo() >= 50) {
				System.out.println("Felcitaciones ud. ha  llegado/superado las 100 horas, "
						+ "tiene un bonus del 20% de su sueldo");
			}else {
				System.out.println("Aun te faltan " + (50 - this.getHorasDeVuelo())
						+ "cantidad de horas para el premio");
			}
			
		}

		@Override
		public void hablar() {
			System.out.println("¿Pollo o Pasta?");
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
}
