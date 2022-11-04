package edu.pitt.menumanager;

/**
 * Class Entree
 * @author : Joseph Altvater
 * @created: 11/04/22
 */

public class MenuTester {
	public static void main(String[] args) {
		MenuRandomize randomize = new MenuRandomize(
				"src/edu/pitt/menumanager/data/entrees.txt",
				"src/edu/pitt/menumanager/data/sides.txt",
				"src/edu/pitt/menumanager/data/salads.txt",
				"src/edu/pitt/menumanager/data/desserts.txt"
		);
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
				myMenu.totalCalories());
	}
}
