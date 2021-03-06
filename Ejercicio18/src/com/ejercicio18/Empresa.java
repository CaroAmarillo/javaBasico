package com.ejercicio18;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Producto> listaDeStock;
	private final double limiteDeuda = 4000;
	private Proveedor provedor;
	private int materiaDisponible;

	public Empresa(String nombre, Proveedor provedor) {
		this.nombre = nombre;
		this.listaClientes = new ArrayList<>();
		this.listaDeStock = new ArrayList<>();
		this.provedor = provedor;
		this.materiaDisponible = 0;
	}

	public Cliente nuevoCliente(String nombre, String apellido, Boolean responsable) {
		Cliente cliente1 = new Cliente(nombre, apellido, responsable);
		listaClientes.add(cliente1);
		return cliente1;
	}

	private Boolean comprobarCliente(Cliente cliente) {
		if (!this.listaClientes.contains(cliente)) {
			System.out.println("El ciente " + cliente.toString() + " no existe ");
			return false;
		}
		if (this.puedeComprar(cliente)) {
			System.out.println("El ciente " + cliente.toString() + " supera la deuda permitida y no puede comprar");
			return false;
		}
		return true;
	}

	private Boolean comprobarPorducto(Producto producto) {
		if (!this.listaDeStock.contains(producto)) {
			System.out.println("El producto solicitado no existe ingreselo por favor");
			return false;
		}
		if (producto.getStock() == 0) {
			System.out.println("No hay existencias de " + producto.toString());
			return false;
		}
		return true;
	}

	public void agregarProductoNuevo(Producto producto) {
		if (listaDeStock.contains(producto)) {
			System.out.println("El producto ya fue ingresado, si es de manufactura utilice agregar stock");
		} else {
			listaDeStock.add(producto);
		}
	}

	public void agregarStock(Producto unProducto, int cantidad) {
		if (listaDeStock.contains(unProducto)) {
			this.materiaDisponible = unProducto.sumarStock(cantidad, this.materiaDisponible);
		}
	}

	private double procesarVenta(Producto prod, Cliente cli) {
		double total = 0;
		total = prod.getPrecio();
		prod.descontarStock();
		cli.comprar(total * (1 + IFactura.iva));
		return total;

	}

	private void facturarVenta(Cliente cli, int cantidad, Producto prod) {
		cli.getCategoria().facturar(cantidad, prod, cli, prod.getPrecio() * cantidad);
	}

	private Boolean puedeComprar(Cliente cliente) {
		return cliente.getDeuda() > limiteDeuda;
	}

	public void vender(Manufactura prod, Cliente cli, int cantidad) {
		double pFinal = 0;
		int comprado = 0;
		if (this.comprobarCliente(cli) && this.comprobarPorducto(prod)) {
			if (prod.getStock() >= cantidad) {
				for (int i = 0; i < cantidad; i++) {
					pFinal += this.procesarVenta(prod, cli);
				}
				comprado = cantidad;
			} else {
				System.out.println("No hay suficientes existencias de " + prod.toString() + " Solo puede comprar "
						+ prod.getStock());
				comprado = prod.getStock();
				for (int i = 0; i < prod.getStock(); i++) {
					pFinal += this.procesarVenta(prod, cli);
				}
			}
		}
		if (pFinal > 0) {
			this.facturarVenta(cli, comprado, prod);
		}
	}

	public void vender(Servicio prod, Cliente cli) {
		double pFinal = 0;
		if (this.comprobarCliente(cli) && this.comprobarPorducto(prod)) {
			pFinal += this.procesarVenta(prod, cli);
		}
		if (pFinal > 0) {
			this.facturarVenta(cli, 1, prod);
		}
	}

	public void adquirirMateriales(int cantidad) {
		this.materiaDisponible = this.provedor.venderMaterial(cantidad);
	}

	public int materialDisponible() {
		return this.materiaDisponible;
	}

	public void cobrar(Cliente unCliente) {
		unCliente.pagarDeuda();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
