package com.nttdata.bootcamp.noviembre.services;

import com.nttdata.bootcamp.noviembre.respository.Building;

/**
 * 
 * @author jmbj
 *
 */
public interface BuildingManagementServiceI {
	
	public Building createBuilding (int numPlantas);
	
	public void addPersonBuildingPlant (Building edificio, int numPlant, String nombreApellidos) throws Exception;

	public void searchPerson (Building edificio, String nombreApellidos) throws Exception;
	
}
