package com.nttdata.bootcamp.noviembre.respository;

/**
 * 
 * @author jmbj
 * 
 *         NTTData BootCamp Dia 3
 * 
 *
 */
public class Building {

	private String[] plantas;

	/**
	 * Constructor de clase edificio Inicializada con el número de plantas del
	 * edificio.
	 * 
	 * @param numPlantas Número de plantas que tendra el edificio.
	 */

	public Building(int numPlantas) {

		super();
		this.plantas = new String[numPlantas];
	}

	/**
	 * Agregar persona
	 * 
	 * @param planta
	 * @param nomApell
	 */
	public void addPerson(int planta, String nomApell) {
		this.plantas[planta] = nomApell;
	}

	/**
	 * Buscar por nombre y apellidos una persona dentro del edificio.
	 * 
	 * @param nomApell
	 */
	public void searchPerson(String nomApell) {
		String resultPerson = nomApell + " No se ha encontrado la persona buscada.";

		for (int i = 0; i < plantas.length; i++) {
			if (plantas[i] == nomApell) {
				resultPerson = nomApell + " Ha sido encontrado en la planta " + i;

			}
		}
		System.out.println(resultPerson);

	}
}
