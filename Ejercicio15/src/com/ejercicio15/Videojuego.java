package com.ejercicio15;

public class Videojuego implements IEntregable {
	
	private String titulo, genero, compania;
	private int horasEstimadas;
	private boolean entregado;
	
	public Videojuego(){
		
	}
	
	public Videojuego(String titulo, String genero, String compania, int horasEstimadas, boolean entregado) {
		this.titulo = titulo;
		this.genero = genero;
		this.compania = compania;
		this.horasEstimadas = 10;
		this.entregado = true;
	}


	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = "";
		this.compania = "";
		this.entregado = true;
		
	}


	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}
	 @Override
	    public String toString(){
	        return "Informacion de la Serie: n" +
	                "tTitulo: "+titulo+"n" +
	                "tGenero: "+genero+"n" +
	                "thoras: "+horasEstimadas+"n" + compania+"n" ;
	            
	    }

}
