package com.nttdata.bootcamp.noviembre.services;

import com.nttdata.bootcamp.noviembre.respository.Orders;

public interface ManagementOrdersI {
	
	public double calculatePVP (double priceWithoutTax);
	public String calculateOrderPrice(Orders orders);
	
}
