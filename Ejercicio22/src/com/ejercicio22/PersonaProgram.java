package com.ejercicio22;

public class PersonaProgram {

		public static void main(String[] ar){
			
			
			Persona persona1 = new Persona("Pepe", 18);
			
			persona1.datosPersona();
			persona1.esMayorDeEdad();
			
			Persona persona2;
			persona2 = new Persona();
			persona2.imprimirDatosScanner();
			persona2.datosPersona();
			persona2.esMayorDeEdad();
			
			
	}
}
