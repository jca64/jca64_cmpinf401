package edu.pitt.menumanager;

public class MenuItem {
	
	private String name;
	private String description;
	private int calories;
	private double price;
	
	public MenuItem(String n, String d, int c, double p) {
		name = n;
		description = d;
		calories = c;
		price = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return name;
	}
}
