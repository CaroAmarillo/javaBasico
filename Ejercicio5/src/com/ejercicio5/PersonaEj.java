package com.ejercicio5;

import java.util.Scanner;

public class PersonaEj {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese su edad: ");
		int edad = Integer.parseInt(scanner.next());
		System.out.println("Ingrese su altura: (Ejemplo 1.74) ");
		double altura = Double.parseDouble(scanner.next()); 
		System.out.println("Ingrese su peso: (Ejemplo 50.2) ");
		double peso = Double.parseDouble(scanner.next()); 	
		System.out.println("Ingrese sexo : M o F");
		char sexo = scanner.nextLine().charAt(0);
		
		
		Persona persona1 = new Persona(nombre, edad, sexo, "0", peso, altura);
		Persona persona2 =  new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona();
		persona3.setNombre(nombre);
		persona3.setEdad(edad);
		persona3.setAltura(altura);
		persona3.setPeso(peso);	
		System.out.println("Persona1: " + persona1.getNombre() + " "+ 
				persona1.getEdad() + " "+" "+
				persona1.getSexo() +
				persona1.getAltura());
		System.out.println("datos persona1" + persona2.getNombre() + 
				persona2.getEdad() + 
				persona2.getSexo());
	}

}
