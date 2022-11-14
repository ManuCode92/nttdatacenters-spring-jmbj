package com.nttdata.bootcamp.noviembre.respository;

import java.util.Arrays;

public class Orders {


	private int id;

	private String customer;

	private String address;

	private boolean peninsula;

	private Product[] products;
	
	public Orders(int idPedido, String destinatario, String direccion, boolean fuerPeninsula, Product[] productos) {
		super();
		this.id = idPedido;
		this.customer = destinatario;
		this.address = direccion;
		this.peninsula = fuerPeninsula;
		this.products = productos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isPeninsula() {
		return peninsula;
	}

	public void setPeninsula(boolean peninsula) {
		this.peninsula = peninsula;
	}

	public Product[] getProductos() {
		return products;
	}

	public void setProductos(Product[] products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "Orders [id=" + id + ", customer=" + customer + ", address=" + address + ", peninsula=" + peninsula
				+ ", products=" + Arrays.toString(products) + "]";
	}
}
