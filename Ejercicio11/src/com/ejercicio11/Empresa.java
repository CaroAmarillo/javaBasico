package com.ejercicio11;

import java.util.ArrayList;


public class Empresa {
	private ArrayList<Repuesto> repuestos;
	private String nombre;
	private ArrayList<Orden> listaOrdenes;

	public Empresa(String nombre){
			
			this.nombre = nombre;
			this.repuestos = new ArrayList<>();
			this.listaOrdenes = new ArrayList<>();
			
		}

	public ArrayList<Repuesto> getRepuestos() {
		return repuestos;
	}

	public void setRepuestos(ArrayList<Repuesto> repuestos) {
		this.repuestos = repuestos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Orden> getListaOrdenes() {
		return listaOrdenes;
	}

	public void setListaOrdenes(ArrayList<Orden> listaOrdenes) {
		this.listaOrdenes = listaOrdenes;
	}
	
	public void mostrarListaOrdenes(){
	
		for (Orden orden : listaOrdenes) {
		
			System.out.println("Numero: " + orden.getNumero() +
					"\nOrden nro: "  + orden.getNumero() +
					"\nFecha: " + orden.getFecha() +
					"\nModelo: " + orden.getModeloPC() +
					"\nProblema: " + orden.getProblema() );
		}
	}
	
	public void mostrarListaRepuestos(){
		
		for (Repuesto repuesto : repuestos) {
			
			System.out.println("Repuesto  Codigo: " + repuesto.getCodigo() + 
					"  Descripcion: " + repuesto.getNombre());
			
		}
	}
		
	}
