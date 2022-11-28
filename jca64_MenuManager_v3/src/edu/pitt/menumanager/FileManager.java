package edu.pitt.menumanager;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 * Class Entree
 * @author : Joseph Altvater
 * @created: 11/04/22
 */

public class FileManager {

	// reads items from file provided and puts them into an ArrayList with the correct type
	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> items = new ArrayList<>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] lineSplit = line.split("@@");

				switch(lineSplit[1]) {
				case "entree":
					Entree e = new Entree(lineSplit[0], lineSplit[2], Integer.parseInt(lineSplit[3]), Double.parseDouble(lineSplit[4]));
					items.add(e);
					break;
				case "side":
					Side si = new Side(lineSplit[0], lineSplit[2], Integer.parseInt(lineSplit[3]), Double.parseDouble(lineSplit[4]));
					items.add(si);
					break;
				case "salad":
					Salad sa = new Salad(lineSplit[0], lineSplit[2], Integer.parseInt(lineSplit[3]), Double.parseDouble(lineSplit[4]));
					items.add(sa);
					break;
				case "dessert":
					Dessert d = new Dessert(lineSplit[0], lineSplit[2], Integer.parseInt(lineSplit[3]), Double.parseDouble(lineSplit[4]));
					items.add(d);
					break;
				}
			}
			fr.close();
			br.close();
		} catch(IOException e) {
			System.out.print("File does not exist.");
		} 
		return items;
	}

	// writes menus to file. separates different menus by "@@" and elements of the menu with " / "
	public static void writeMenus(String fileName, ArrayList<Menu> menus) {

		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);

			for(Menu i : menus) {

				Entree e = i.getEntree();
				Side si = i.getSide();
				Salad sa = i.getSalad();
				Dessert d = i.getDessert();

				int totalCal = e.getCalories() + si.getCalories() + sa.getCalories() + d.getCalories();
				double totalPrice = e.getPrice() + si.getPrice() + sa.getPrice() + d.getPrice();

				bw.write(i.getName() + "@@" + e + " / " + e.getDescription() + " / " + 
						e.getCalories() + "@@" + si + " / " + si.getDescription() + " / " +
						si.getCalories() + "@@" + sa + " / " + sa.getDescription() + " / " +
						sa.getCalories() + "@@" + d + " / " + d.getDescription() + " / " +
						d.getCalories() + "@@" + totalCal + "@@" + totalPrice + "\n");
			}
			bw.close();
			fw.close();
		} catch(IOException e) {
			System.out.println("File not found.");
		}

	}	
}
