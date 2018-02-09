package com.Tp.MVC.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Libro {
	
	@Id
	@GeneratedValue
	private long idLibro;
	
	private String nombreLibro;
	
	@Transient
	private ArrayList<Long> listaIdsGenero;
	
	@OneToMany(mappedBy = "libro",
	fetch = FetchType.EAGER)
	private List<LibroGenero> listaGenero;

	public long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(long idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public ArrayList<Long> getListaIdsGenero() {
		return listaIdsGenero;
	}

	public void setListaIdsGenero(ArrayList<Long> listaIdsGenero) {
		this.listaIdsGenero = listaIdsGenero;
	}

	public List<LibroGenero> getListaGenero() {
		return listaGenero;
	}

	public void setListaGenero(List<LibroGenero> listaGenero) {
		this.listaGenero = listaGenero;
	}	
	
}
