package com.ejercicio6;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club club = new Club("d");
		Jugador jugador = new Jugador("asdasd", 2, club);
		club.mostrarListaJugadores();
		
		Auto auto = new Auto("chevrolet", "azul", jugador);
		jugador.mostrarListaAutos();
		

	}

}
