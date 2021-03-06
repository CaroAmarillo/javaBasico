package com.ejercicio15;

public class Serie implements IEntregable {

	private String titulo, genero, creador;
	private int numeroDeTemporadas;
	private boolean entregado;
	
	public Serie() {
	}
	
	public Serie(String titulo, String creador){
		
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";
		this.numeroDeTemporadas = 3;
		this.entregado = false;
		
	}

	public Serie(String titulo, String genero, String creador, int numeroDeTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }
  
    @Override
    public String toString(){
        return "Informacion de la Serie: n" +
                "tTitulo: "+titulo+"n" +
                "tNumero de temporadas: "+numeroDeTemporadas+"n" +
                "tGenero: "+genero+"n" +
                "tCreador: "+creador;
    }
  
	@Override
	public void entregar() {
		
		entregado = true;
		
	}
	@Override
	 public void devolver() {
	        entregado=false;
	    }
}
