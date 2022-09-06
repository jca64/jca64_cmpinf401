package edu.pitt.assignment1;
import javax.swing.JOptionPane;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		String aLength = JOptionPane.showInputDialog("What is the base length?");
		String bLength = JOptionPane.showInputDialog("What is the height length?");
		
		double a = Double.parseDouble(aLength);
		double b = Double.parseDouble(bLength);
		
		double hypot = Math.sqrt((Math.pow(a, 2.0) + Math.pow(b, 2.0)));
		hypot = hypot * 100;
		int h = (int) Math.round(hypot);
		hypot = h/100.0;
		
		String result = ("The hypotenuse is " + hypot + ".");
		
		
		JOptionPane.showMessageDialog(null, result);
		
	}

}
