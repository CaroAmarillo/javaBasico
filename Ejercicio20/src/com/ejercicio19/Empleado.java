package com.ejercicio19;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private int sueldo;
	
	public void datos() {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre=scanner.next();
        System.out.print("Ingrese su sueldo:");
        sueldo=(int) scanner.nextFloat();
    }
	
	public void mostrarDatos(){
		System.out.println("Nombre: " + nombre + ", Sueldo: " + sueldo);		
	}
	
	public void pagarImpuestos() {
		if(sueldo > 3000){
			System.out.println("Su sueldo es mayor, debera pagar impuestos.");						
		}else {
			System.out.println("No debera pagar impuestos.");
		}
	}
	
}
