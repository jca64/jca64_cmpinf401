package edu.pitt.menumanager;

import java.util.ArrayList;

/**
 * Class Entree
 * @author : Joseph Altvater
 * @created: 11/04/22
 */

public class MenuRandomize {
	
	private ArrayList<Entree> entree = new ArrayList<>();
	private ArrayList<Side> side = new ArrayList<>();
	private ArrayList<Salad> salad = new ArrayList<>();
	private ArrayList<Dessert> dessert = new ArrayList<>();
	
	/**
	* Constructor MenuRandomize
	* @param String entreeFile Name of file holding all the entrees
	* @param String sideFile Name of file holding all the sides
	* @param String saladFile Name of file holding all the salads
	* @param String dessertFile Name of file holding all the desserts
	* Populates class ArrayLists
	*/
	MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		entree = FileManager.readEntrees(entreeFile);
		side = FileManager.readSides(sideFile);
		salad = FileManager.readSalads(saladFile);
		dessert = FileManager.readDesserts(dessertFile);
	}
	
	/**
	* Method readDesserts
	* @return A randomly made menu
	*/
	public Menu randomMenu() {
		Menu randomMenu = new Menu("randomMenu", entree.get(((int)(Math.random() * 5))), side.get(((int)(Math.random() * 5))), salad.get(((int)(Math.random() * 5))), dessert.get(((int)(Math.random() * 5))));
		return randomMenu;
	}
}