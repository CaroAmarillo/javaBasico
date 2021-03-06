package com.ejercicio6;

import java.util.ArrayList;

public class Jugador {
	private ArrayList<Auto> listaDeAutos;
	private String nombre;
	private int salario;
	private Club club;
	private int aumentoSalario;
	private int disminuyeSalario;
	
	public Jugador(String nombre,int salario,Club club){
		this.nombre = nombre;
		this.salario = salario;
		this.club = club;
		this.listaDeAutos = new ArrayList<>();
		
		club.getListaJugadores().add(this);
		
	}

	public ArrayList<Auto> getListadeAutos() {
		return listaDeAutos;
	}

	public void setListadeAutos(ArrayList<Auto> listaDeAutos) {
		this.listaDeAutos = listaDeAutos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}
	
	public void setAumentoSalario(boolean gol){
		if (gol){
			this.salario += this.aumentoSalario;
		}
	}
	
	public void setRebajaSalario(boolean tarjetaRoja){
		if(tarjetaRoja){
			this.salario -= this.disminuyeSalario;
		}
	}
	public void mostrarListaAutos()
	{
		for (Auto auto : listaDeAutos) {
			System.out.println("Nombre: " + auto.marca + "\nColor : " + auto.color);
		}
	}

}
