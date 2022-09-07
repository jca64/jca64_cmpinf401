package edu.pitt.lab2;
import javax.swing.JOptionPane;

public class Lab2_Problem1 {

	public static void main(String[] args) {
		String aLength = JOptionPane.showInputDialog("What is the base length?");
		String bLength = JOptionPane.showInputDialog("What is the height length?");
		
		double a = Double.parseDouble(aLength); // Base length converted to double
		double b = Double.parseDouble(bLength); // Height converted to double
		
		double hypot = Math.sqrt((Math.pow(a, 2.0) + Math.pow(b, 2.0)));
		hypot = hypot * 100;
		int h = (int) Math.round(hypot);
		hypot = h/100.0; 
		
		String result = ("The hypotenuse is " + hypot + ".");
		
		
		JOptionPane.showMessageDialog(null, result);
		
	}

}
