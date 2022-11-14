package com.nttdata.bootcamp.noviembre.services;


import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.noviembre.respository.Orders;
import com.nttdata.bootcamp.noviembre.respository.Product;

@Service("outsidePeninsula")
public class ManagementOrdersOutsidePeninsulaImpl implements ManagementOrdersI {

	@Override
	public double calculatePVP(double priceWithoutTax) {

		double ivaPeninsula = priceWithoutTax * 0.04;

		return priceWithoutTax + ivaPeninsula;
	}

	@Override
	public String calculateOrderPrice(Orders orders) {

		double priceOrder=0;
		
		for (Product producto : orders.getProductos()) {
			priceOrder = priceOrder + calculatePVP(producto.getPriceWithoutPVP());
		}

		return "El pedido de tiene un valor total de " + String.format("%.2f", priceOrder);
	}

}
