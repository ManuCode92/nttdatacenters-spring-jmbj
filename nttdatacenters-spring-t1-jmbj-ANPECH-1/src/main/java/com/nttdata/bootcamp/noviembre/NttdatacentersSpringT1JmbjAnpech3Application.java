package com.nttdata.bootcamp.noviembre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nttdata.bootcamp.noviembre.respository.Building;
import com.nttdata.bootcamp.noviembre.services.BuildingManagementServiceI;


/**
 * 
 * @author jmbj
 * 
 * BootCamp Taller 1 Spring
 *
 */
@SpringBootApplication
public class NttdatacentersSpringT1JmbjAnpech3Application implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(NttdatacentersSpringT1JmbjAnpech3Application.class,
				args);
		ctx.close();
	}

	// Utiliza la implementacion de edificio

	@Qualifier("edificio")
	@Autowired
	BuildingManagementServiceI buildingManagementService;

	// Utiliza la implementacion de oficinas

	@Qualifier("oficinas")
	@Autowired
	BuildingManagementServiceI buildingOfficeService;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Loading app");

		// Edificio
		Building edificioTaller1 = buildingManagementService.createBuilding(6);
		// Oficina
		Building officinaTaller1 = buildingOfficeService.createBuilding(6);

		
		System.out.println();
		// Agregar personas al edificio
		buildingManagementService.addPersonBuildingPlant(edificioTaller1, 0, "Jose Manuel Becerra");
		buildingManagementService.addPersonBuildingPlant(edificioTaller1, 1, "Patrick Duran");
		buildingManagementService.addPersonBuildingPlant(edificioTaller1, 2, "Yojan Aguilera");

		// Agregar personas en oficina

		buildingOfficeService.addPersonBuildingPlant(officinaTaller1, 0, "Pepe Montoro");

		System.out.println("Buscando persona en Oficina");
		System.out.println();

		// Buscar en Oficina
		buildingOfficeService.searchPerson(officinaTaller1, "Patrick Duran");
		buildingOfficeService.searchPerson(officinaTaller1, "Pepe Montoro");

		System.out.println();

		System.out.println("Buscando persona en edificio");
		// Buscar en edificio
		buildingManagementService.searchPerson(edificioTaller1, "Yojan ");
		buildingManagementService.searchPerson(edificioTaller1, "Jose Manuel Becerra");

		System.out.println();

		System.out.println("Close app");

	}

}
