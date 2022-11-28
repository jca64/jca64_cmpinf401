package edu.pitt.menumanager;

import java.util.ArrayList;

/**
 * Class Entree
 * @author : Joseph Altvater
 * @created: 11/27/22
 */

public class MenuManager {

	private ArrayList<Entree> entrees = new ArrayList<>();
	private ArrayList<Side> sides = new ArrayList<>();
	private ArrayList<Salad> salads = new ArrayList<>();
	private ArrayList<Dessert> desserts = new ArrayList<>();

	public MenuManager(String dishesFile) {

		ArrayList<MenuItem> items = FileManager.readItems(dishesFile);

		for(MenuItem i : items) {

			if(i instanceof Entree) {
				entrees.add((Entree) i);
			}
			else if(i instanceof Side) {
				sides.add((Side) i);
			}
			else if(i instanceof Salad) {
				salads.add((Salad) i);
			}
			else {
				desserts.add((Dessert) i);
			}
		}
	}

	public Menu randomMenu(String name) {

		Entree randomEntree = entrees.get((int)(Math.random() * (entrees.size())));
		Side randomSide = sides.get((int)(Math.random() * (sides.size())));
		Salad randomSalad = salads.get((int)(Math.random() * (salads.size())));
		Dessert randomDessert= desserts.get((int)(Math.random() * (desserts.size())));

		Menu randomMenu = new Menu(name, randomEntree, randomSide, randomSalad, randomDessert);

		return randomMenu;
	}

	public Menu minCaloriesMenu(String name) {

		Entree minEntree = entrees.get(0);
		Side minSide = sides.get(0);
		Salad minSalad = salads.get(0);
		Dessert minDessert = desserts.get(0);

		for(Entree i : entrees) {
			if(i.getCalories() < minEntree.getCalories())
				minEntree = i;
		}
		for(Side i : sides) {
			if(i.getCalories() < minSide.getCalories())
				minSide = i;
		}
		for(Salad i : salads) {
			if(i.getCalories() < minSalad.getCalories())
				minSalad = i;
		}
		for(Dessert i : desserts) {
			if(i.getCalories() < minDessert.getCalories())
				minDessert = i;
		}

		Menu min = new Menu(name, minEntree, minSide, minSalad, minDessert);

		return min;
	}

	public Menu maxCaloriesMenu(String name) {

		Entree maxEntree = entrees.get(0);
		Side maxSide = sides.get(0);
		Salad maxSalad = salads.get(0);
		Dessert maxDessert = desserts.get(0);

		for(Entree i : entrees) {
			if(i.getCalories() > maxEntree.getCalories())
				maxEntree = i;
		}
		for(Side i : sides) {
			if(i.getCalories() > maxSide.getCalories())
				maxSide = i;
		}
		for(Salad i : salads) {
			if(i.getCalories() > maxSalad.getCalories())
				maxSalad = i;
		}
		for(Dessert i : desserts) {
			if(i.getCalories() > maxDessert.getCalories())
				maxDessert = i;
		}

		Menu max = new Menu(name, maxEntree, maxSide, maxSalad, maxDessert);

		return max;
	}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}

}
