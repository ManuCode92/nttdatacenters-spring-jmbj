package com.nttdata.bootcamp.noviembre.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.noviembre.respository.Orders;
import com.nttdata.bootcamp.noviembre.respository.Product;


@Service
@Primary
public class ManagementOrdersPeninsulaImpl implements ManagementOrdersI {

	@Override
	public double calculatePVP(double priceWithoutTax) {


		double iva = priceWithoutTax * 0.21;
		return priceWithoutTax + iva;
	}

	@Override
	public String calculateOrderPrice(Orders orders) {

		double priceOrder = 0;
		for (Product producto : orders.getProductos()) {
			priceOrder = priceOrder + calculatePVP(producto.getPriceWithoutPVP());
		}
		return "El pedido tiene un valor total de " + String.format("%.2f", priceOrder);
	}

}
