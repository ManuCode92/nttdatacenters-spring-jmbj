package com.nttdata.bootcamp.noviembre.respository;

public class Product {

	private int id;

	private String name;

	private double priceWithoutPVP;
	
	public Product(int idPedido, String nombre, double precioSinIva) {
		super();
		this.id = idPedido;
		this.name = nombre;
		this.priceWithoutPVP = precioSinIva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPriceWithoutPVP() {
		return priceWithoutPVP;
	}

	public void setPriceWithoutPVP(double pricePVP) {
		this.priceWithoutPVP = pricePVP;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", priceWithoutPVP=" + priceWithoutPVP + "]";
	}
	
	

}
