package com.Caro.TpFinal.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Repuesto {
	@Id
	@GeneratedValue
	private long idRepuesto;
	private String nombreRepuesto;
	private float costoRepuesto;
	
	@OneToMany(mappedBy = "repuesto")
	private List<OrdenRepuesto> listaOrdenRepuestosA;

	public long getIdRepuesto() {
		return idRepuesto;
	}

	public void setIdRepuesto(long idRepuesto) {
		this.idRepuesto = idRepuesto;
	}

	public String getNombreRepuesto() {
		return nombreRepuesto;
	}

	public void setNombreRepuesto(String nombreRepuesto) {
		this.nombreRepuesto = nombreRepuesto;
	}

	public float getCostoRepuesto() {
		return costoRepuesto;
	}

	public void setCostoRepuesto(float costoRepuesto) {
		this.costoRepuesto = costoRepuesto;
	}

	public List<OrdenRepuesto> getListaOrdenRepuestosA() {
		return listaOrdenRepuestosA;
	}

	public void setListaOrdenRepuestosA(List<OrdenRepuesto> listaOrdenRepuestosA) {
		this.listaOrdenRepuestosA = listaOrdenRepuestosA;
	}
	
}
