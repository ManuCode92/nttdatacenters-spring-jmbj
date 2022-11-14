package com.nttdata.bootcamp.noviembre.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.noviembre.respository.Building;

@Qualifier ("edificio")
@Service
public class BuildingManagementServiceImpl implements BuildingManagementServiceI {

	@Override
	public Building createBuilding(int numPlantas) {
		Building edificio = new Building(numPlantas);

		return edificio;
	}

	@Override
	public void addPersonBuildingPlant(Building edificio, int numPlant, String nombreApellidos) throws Exception {

		edificio.addPerson(numPlant, nombreApellidos);

	}

	@Override
	public void searchPerson(Building edificio, String nombreApellidos) throws Exception {

		edificio.searchPerson(nombreApellidos);
	}

}
