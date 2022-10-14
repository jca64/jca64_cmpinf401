package edu.pitt.menumanager;

/**
 * Class Side
 * author : Joseph Altvater
 * created: 10/13/2022
 */

public class Side {

	private String name;
	private String description;
	private int calories;
	
	public Side(String n, String d, int c) {
		name = n;
		description = d;
		calories = c;
	}

	//Getters and setters
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
}
