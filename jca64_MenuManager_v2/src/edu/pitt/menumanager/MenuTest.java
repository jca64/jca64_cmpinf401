package edu.pitt.menumanager;

/**
 * Class MenuTest
 * author : Joseph Altvater
 * created: 10/13/2022
 */

public class MenuTest {

	public static void main(String[] args) {
		
		/*Create, for example, 2 entrees, 1 side, 2 salads and 1 dessert and 2 Menu objects. 
		Then fill the first menu with an entree and a salad. Fill the second menu 
		with the remaining: 1 entree, 1 side, 1 salad and 1 dessert. Print out both menus, 
		including the menu name, the total amount of calories and the description. 
		Note that this is only to test the classes, so just make sure you try all the functionalities 
		of Menu and other classes here.*/

		Entree filet = new Entree("Filet Mignon", "Our signature 8 oz grilled and seasoned filet cooked to your liking.", 500);
		Entree sirloin = new Entree("Sirloin", "A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked. ", 550);
		Side mashedPotatoes = new Side("Garlic Mashed Potatoes", "Potatoes boiled and mashed with fresh garlic until perfectly creamy.", 250);
		Salad caesarSalad = new Salad("Caesar Salad", "a green salad of romaine lettuce and croutons dressed with lemon juice, olive oil, egg, Worcestershire sauce, anchovies, garlic, Dijon mustard, Parmesan cheese, and black pepper.", 100);
		Dessert chocolateChunkPizookie = new Dessert("Chocolate Chunk Pizookie", "Fresh baked chocolate chip cookie topped with rich vanilla bean ice cream.", 1150);
		Menu week = new Menu("Weekday Menu", sirloin, mashedPotatoes);
		Menu weekend = new Menu("Weekend Menu", filet, mashedPotatoes, caesarSalad, chocolateChunkPizookie);
		
		System.out.println(week.description());
		System.out.println("This menu is " + week.totalCalories() + " calories total.");
		System.out.println(weekend.description());
		System.out.println("This menu is " + weekend.totalCalories() + " calories total.");
		
	}

}
