package edu.pitt.menumanager;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * Class Entree
 * @author : Joseph Altvater
 * @created: 11/04/22
 */

public class FileManager {
	
	/**
	* Method readEntrees
	* @param fileName Name of txt file that holds entrees
	* @return An ArrayList of entrees
	*/

	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> en = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] lineSplt = line.split("@@");
				Entree e = new Entree(lineSplt[0], lineSplt[1], Integer.parseInt(lineSplt[2]));
				en.add(e);
			}
			fr.close();
			br.close();
		} catch(IOException e) {
			System.out.print(e);
			System.out.print("File does not exist.");
		} finally {
			
		}
		return en;
	}
	
	/**
	* Method readSides
	* @param fileName Name of txt file that holds sides
	* @return An ArrayList of sides
	*/
	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> si = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] lineSplt = line.split("@@");
				Side s = new Side(lineSplt[0], lineSplt[1], Integer.parseInt(lineSplt[2]));
				si.add(s);
			}
			fr.close();
			br.close();
		} catch(IOException e) {
			System.out.print("File does not exist.");
		} finally {
			
		}
		return si;
	}
	
	/**
	* Method readSalads
	* @param fileName Name of txt file that holds salads
	* @return An ArrayList of salads
	*/
	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> sa = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] lineSplt = line.split("@@");
				Salad s = new Salad(lineSplt[0], lineSplt[1], Integer.parseInt(lineSplt[2]));
				sa.add(s);
			}
			fr.close();
			br.close();
		} catch(IOException e) {
			System.out.print("File does not exist.");
		} finally {
			
		}
		return sa;
	}
	
	/**
	* Method readDesserts
	* @param fileName Name of txt file that holds desserts
	* @return An ArrayList of desserts
	*/
	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> de = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] lineSplt = line.split("@@");
				Dessert d = new Dessert(lineSplt[0], lineSplt[1], Integer.parseInt(lineSplt[2]));
				de.add(d);
			}
			fr.close();
			br.close();
		} catch(IOException e) {
			System.out.print("File does not exist.");
		} finally {
			
		}
		return de;
	}
	
}
