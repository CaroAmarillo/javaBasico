package com.ejercicio18;

public class Proveedor {

		private String nombre;
		private MateriaPrima materiales;
		
		public Proveedor(String nombre, String materia){
			this.setNombre(nombre);
			this.materiales = new MateriaPrima(materia);
		}
		
		public void generarMateriaPrima(int cantidad){
			this.materiales.agregarMateria(cantidad);
		}
		
		public int venderMaterial(int cantidad){
			int venta;
			if(cantidad<materiales.getCantidad()){
				venta = cantidad;
				materiales.venderMateria(cantidad);
			}
			else{
				System.out.println("No tengo suficiente materia te puedo vender " + cantidad);
				venta = materiales.getCantidad();
				materiales.venderMateria(materiales.getCantidad());
			}
			return venta;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	}
