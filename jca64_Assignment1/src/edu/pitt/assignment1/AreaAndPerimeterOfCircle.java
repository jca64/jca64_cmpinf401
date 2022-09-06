package edu.pitt.assignment1;
import javax.swing.JOptionPane;

public class AreaAndPerimeterOfCircle {
	
	public static void main(String[] args) {

	String radius = JOptionPane.showInputDialog("What is the radius?");
	double r = Double.parseDouble(radius);
	
	double p = 2 * Math.PI * r;
	p = p * 100;
	int temp1 = (int) Math.round(p);
	p = temp1/100.0; // Rounded down perimeter
	double a = Math.PI * r * r;
	a = a * 100;
	int temp2 = (int) Math.round(a);
	a = temp2/100.0; // Rounded down area
	
	String result = ("The circle with radius " + r + " has an area of " + a + " and a perimeter of " + p + ".");
	
	JOptionPane.showMessageDialog(null, result);
	}
	
}
