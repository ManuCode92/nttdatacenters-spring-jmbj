package com.nttdata.bootcamp.noviembre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nttdata.bootcamp.noviembre.respository.Orders;
import com.nttdata.bootcamp.noviembre.respository.Product;
import com.nttdata.bootcamp.noviembre.services.ManagementOrdersI;

/**
 * 
 * @author jmbj
 * 
 *         BootCamp Taller 2 Spring
 *
 */

@SpringBootApplication
public class NttdatacentersSpringT2JmbjAnpech2Application implements CommandLineRunner {

	@Autowired
	@Qualifier("outsidePeninsula")
	ManagementOrdersI ordersOutsidePeninsulaService;

	// Al no poner Qualifier cogera la @Primary
	@Autowired
	ManagementOrdersI ordersPeninsulaService;

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(NttdatacentersSpringT2JmbjAnpech2Application.class,
				args);
		ctx.close();
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("-----------> Loading App <-----------");

		Product[] listProduct = new Product[3];

		listProduct[0] = new Product(1, "Iphone 14 Pro Max", 1499.00);
		listProduct[1] = new Product(2, "Airpods pro 3", 299.00);
		listProduct[2] = new Product(3, "Apple Paquete de 4 AirTag", 110.00);

		System.out.println("-----------> Mostrando producto <-----------");

		for (Product product : listProduct) {
			System.out.println(product);
		}
		System.out.println();

		// Añadiendo pedido con el 21% de IVA
		Orders orderPeninsula = new Orders(1, "Jose Manuel Becerra", "Calle San Pablo", false, listProduct);

		// Añadiendo pedido con el 4% de IVA
		Orders orderOutsidePeninsula = new Orders(2, "Patrick Aguilera", "Calle nervion", true, listProduct);

		System.out.println("-----------> Precio Iphone 14 fuera de de la peninsula <-----------");

		System.out.println("El Iphone tiene un precio con IVA de "
				+ ordersOutsidePeninsulaService.calculatePVP(listProduct[0].getPriceWithoutPVP()));

		System.out.println();

		System.out.println("-----------> Precio Iphone 14 dentro de la peninsula <-----------");

		System.out.println("El Iphone tiene un precio con IVA de "
				+ ordersPeninsulaService.calculatePVP(listProduct[0].getPriceWithoutPVP()));

		System.out.println();

		System.out.println("-----------> Pedidos dentro de la peninsula <-----------");
		System.out.println();
		System.out.println(ordersPeninsulaService.calculateOrderPrice(orderPeninsula));

		System.out.println("-----------> Pedidos fuera de la peninsula <-----------");
		System.out.println();
		System.out.println(ordersOutsidePeninsulaService.calculateOrderPrice(orderOutsidePeninsula));

		System.out.println("-----------> Close App <-----------");

	}

}
