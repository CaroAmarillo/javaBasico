package com.ModeloEmpresa.Modelo;

import java.util.ArrayList;

public class Empresa {

	private String _nombre;
	private ArrayList<Cliente> _clientes;
	private ArrayList<Producto> _stock;
	private final double limiteDeuda = 10000;
	private Proveedor provedor;
	private int materiaDisponible;

	public Empresa(String nombre, Proveedor prov) {
		this._nombre = nombre;
		this._clientes = new ArrayList<>();
		this._stock = new ArrayList<>();
		this.provedor = prov;
		this.materiaDisponible = 0;
	}

	// si el cliente no existe se debera ingresar antes de comprar
	public Cliente nuevoCliente(String nombre, String apellido, Boolean responsable) {
		Cliente clienteNuevo = new Cliente(nombre, apellido, responsable);
		_clientes.add(clienteNuevo);
		return clienteNuevo;
	}

	private Boolean comprobarCliente(Cliente unCliente) {
		if (!this._clientes.contains(unCliente)) {
			System.out.println("El ciente " + unCliente.toString() + " no existe ingreselo por favor");
			return false;
		}
		if (this.puedeComprar(unCliente)) {
			System.out.println("El ciente " + unCliente.toString() + " supera la deuda permitida y no puede comprar");
			return false;
		}
		return true;
	}

	private Boolean comprobarPorducto(Producto unProducto) {
		if (!this._stock.contains(unProducto)) {
			System.out.println("El producto solicitado no existe ingreselo por favor");
			return false;
		}
		if (unProducto.getStock() == 0) {
			System.out.println("No hay existencias de " + unProducto.toString());
			return false;
		}
		return true;
	}

	public void agregarProductoNuevo(Producto unProducto) {
		if (_stock.contains(unProducto)) {
			System.out.println("El producto ya fue ingresado, si es de manufactura utilice agregar stock");
		} else {
			_stock.add(unProducto);
		}
	}

	public void agregarStock(Producto unProducto, int cantidad) {
		if (_stock.contains(unProducto)) {
			this.materiaDisponible = unProducto.sumarStock(cantidad, this.materiaDisponible);
		}
	}

	private double procesarVenta(Producto prod, Cliente cli) {
		double total = 0;
		total = prod.getPrecio();
		prod.descontarStock();
		cli.comprar(total * (1 + ITipoFacturacion.iva));
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

}
