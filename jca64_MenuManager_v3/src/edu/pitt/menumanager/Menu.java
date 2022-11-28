package edu.pitt.menumanager;

/**
 * Class Menu
 * author : Joseph Altvater
 * created: 10/13/2022
 */

public class Menu {

	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;

	public Menu(String n) {
		name = n;
		entree = null;
		side = null;
		salad = null;
		dessert = null;
	}

	public Menu(String n, Entree e, Side si) {
		name = n;
		entree = e;
		side = si;
		salad = null;
		dessert = null;
	}

	public Menu(String n, Entree e, Side si, Salad sa, Dessert d) {
		name = n;
		entree = e;
		side = si;
		salad = sa;
		dessert = d;
	}

	//sums the calories of all the parts of the menu (Entree, Side, Salad and Dessert)
	public int totalCalories() {
		int totalCalories = 0;
		if(this.getEntree() != null) {
			totalCalories += this.getEntree().getCalories();
		}
		if(this.getSide() != null) {
			totalCalories += this.getSide().getCalories();
		}
		if(this.getSalad() != null) {
			totalCalories += this.getSalad().getCalories();
		}
		if(this.getDessert() != null) {
			totalCalories += this.getDessert().getCalories();
		}
		return totalCalories;
	}

	/*concatenates the descriptions of the parts of the menu in order. 
	First Entree, then side, then salad and lastly, dessert. It has to 
	separate the descriptions by new lines and add the type and the name 
	of each part of the menu. A menu could lack some of the parts, in this case, 
	it has to indicate that with N/A.*/
	public String description() {
		String eDesc = "N/A";
		String siDesc = "N/A";
		String saDesc = "N/A";
		String dDesc = "N/A";

		if(this.getEntree() != null) {
			eDesc = entree.getDescription();
		}

		if(this.getSide() != null) {
			siDesc = side.getDescription();
		}

		if(this.getSalad() != null) {
			saDesc = salad.getDescription();
		}

		if(this.getDessert() != null) {
			dDesc = dessert.getDescription();
		}

		String description = "Entree: " + eDesc + "\n" +
				"Side: " + siDesc +  "\n" +
				"Salad: " + saDesc +  "\n" +
				"Dessert: " + dDesc;
		return description;
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	public String toString() {
		return name;
	}
}
