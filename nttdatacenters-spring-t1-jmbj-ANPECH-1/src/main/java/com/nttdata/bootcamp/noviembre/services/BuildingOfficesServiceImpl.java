package com.nttdata.bootcamp.noviembre.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.nttdata.bootcamp.noviembre.respository.Building;


@Qualifier("oficinas")
@Service
public class BuildingOfficesServiceImpl implements BuildingManagementServiceI {

	@Override
	public Building createBuilding(int numPlantas) {

		Building offices = new Building(numPlantas + 1);
		offices.addPerson(0, "PARKING");
		return offices;
	}

	@Override
	public void addPersonBuildingPlant(Building edificio, int numPlant, String nombreApellidos) throws Exception {

		edificio.addPerson(numPlant + 1, nombreApellidos);
		

	}

	@Override
	public void searchPerson(Building edificio, String nombreApellidos) throws Exception {

		edificio.searchPerson(nombreApellidos);

	}

}
