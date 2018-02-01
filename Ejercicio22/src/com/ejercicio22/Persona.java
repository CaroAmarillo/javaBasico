package com.ejercicio22;

import java.util.Scanner;

public class Persona {
	public String nombre;
	public int edad;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {}

	public void datosPersona(){
		System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad);
	}
	
	public void esMayorDeEdad(){
		if(this.edad >= 18){
			
			System.out.println("Es mayor de edad :D");
		}
		else{
			
			System.out.println("No es mayor de edad :(");
			
		}
	}
	
	public void imprimirDatosScanner(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre");
		this.nombre = scanner.nextLine();
		System.out.println("Ingrese edad");
		this.edad = Integer.parseInt(scanner.next());
	}
}
