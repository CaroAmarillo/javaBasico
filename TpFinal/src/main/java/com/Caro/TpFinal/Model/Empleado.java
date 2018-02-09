package com.Caro.TpFinal.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empleado {
	
		@Id
		@GeneratedValue
		private long idEmpleado;
		private String nombreEmpleado, apellidoEmpleado;
		private int contraseña;
		
		@OneToMany(mappedBy = "empleado")
		private List<OrdenDeTrabajo> listaOrdenDeTrabajo;

		public long getIdEmpleado() {
			return idEmpleado;
		}

		public void setIdEmpleado(long idEmpleado) {
			this.idEmpleado = idEmpleado;
		}

		public String getNombreEmpleado() {
			return nombreEmpleado;
		}

		public void setNombreEmpleado(String nombreEmpleado) {
			this.nombreEmpleado = nombreEmpleado;
		}

		public String getApellidoEmpleado() {
			return apellidoEmpleado;
		}

		public void setApellidoEmpleado(String apellidoEmpleado) {
			this.apellidoEmpleado = apellidoEmpleado;
		}

		public List<OrdenDeTrabajo> getListaOrdenDeTrabajo() {
			return listaOrdenDeTrabajo;
		}

		public void setListaOrdenDeTrabajo(List<OrdenDeTrabajo> listaOrdenDeTrabajo) {
			this.listaOrdenDeTrabajo = listaOrdenDeTrabajo;
		}

		public int getContraseña() {
			return contraseña;
		}

		public void setContraseña(int contraseña) {
			this.contraseña = contraseña;
		}
		
}