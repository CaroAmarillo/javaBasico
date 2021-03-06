package com.ejercicio5;

public class Persona {
	
	private String nombre, dni;
	private int edad;
	private final char sexoPorDefecto = 'M';
	private char sexo;
	private double peso, altura;	

	public Persona(){
		this.nombre = "";
		this.dni = "";
		this.edad = 0;
		this.sexo = this.sexoPorDefecto;
		this.peso = 0;
		this.altura = 0;		
	}
	
	public Persona(String nom, int edad, char sexo){
		this.nombre = nom;
		this.edad = edad;
		this.sexo = sexo;		
	}
	
	
	public Persona(String nom,int edad, char sexo, String dni, double peso, double altura){
		
		this.nombre = nom;
		this.sexo = sexo;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		
	}	

	public void calcularIMC(){
		double pesoIdeal = this.peso/(this.altura*this.altura);
		if (pesoIdeal > 25){
			
			System.out.println("Usted esta excedido/a de peso");
		}
	}
	
	public void esMayorDeEdad(){
		if(this.edad >= 18){
			System.out.println("Usted es mayor de edad");
		}else{
			System.out.println("Usted no es mayor de edad");
		}
	}
	
	public void generaDNI(){
		this.dni = "39758410";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexoPorDefecto() {
		return sexoPorDefecto;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
	
	
	
}