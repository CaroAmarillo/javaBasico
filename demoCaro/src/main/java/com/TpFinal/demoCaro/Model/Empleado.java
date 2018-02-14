package com.TpFinal.demoCaro.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Empleado {
	
	@Id 
	@GeneratedValue
	private long idEmpleado;
	
	private String nombre,apellido;
	
	@OneToMany(mappedBy = "empleado")
	private List<OrdenDeTrabajo> listaDeOrdenDetrabajo;
	
	@OneToOne(mappedBy = "empleado")
	private Usuario usuario;

	public long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<OrdenDeTrabajo> getListaDeOrdenDetrabajo() {
		return listaDeOrdenDetrabajo;
	}

	public void setListaDeOrdenDetrabajo(List<OrdenDeTrabajo> listaDeOrdenDetrabajo) {
		this.listaDeOrdenDetrabajo = listaDeOrdenDetrabajo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
		
}