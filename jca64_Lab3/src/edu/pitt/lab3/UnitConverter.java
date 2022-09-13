package edu.pitt.lab3;
import javax.swing.JOptionPane;

public class UnitConverter {
	
	public static double cmToIn(double a) {
		return(a/2.54);
	}
	
	public static double inToCm(double b) {
		return(b*2.54);
	}
	
	public static double ydToM(double c) {
		return(c*0.9144);
	}
	
	public static double mToYd(double d) {
		return(d/0.9144);
	}
	
	public static double ozToG(double e) {
		return(e*28.349523125);
	}
	
	public static double gToOz(double f) {
		return(f/28.349523125);
	}
	
	public static double lbToKg(double g) {
		return(g*0.45359237);
	}
	
	public static double kgToLb(double h) {
		return(h/0.45359237);
	}

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Enter a distance or weight amount: ");
		String strAmount = "";
		String unit = "";
		double doubleAmount = 0;
		
		for(int i=0; i<userInput.length(); i++) {
			if(userInput.substring(i, i+1).equals(" ")) {
				unit = userInput.substring(i+1);
				strAmount = userInput.substring(0, i);
				doubleAmount = Double.parseDouble(strAmount);
			}
		}
		
		switch(unit) {
		case "cm": JOptionPane.showMessageDialog(null, (userInput + " = " + cmToIn(doubleAmount) + " in"));
		break;
		case "in": JOptionPane.showMessageDialog(null, (userInput + " = " + inToCm(doubleAmount) + " cm"));
		break;
		case "yd": JOptionPane.showMessageDialog(null, (userInput + " = " + ydToM(doubleAmount) + " m"));
		break;
		case "m": JOptionPane.showMessageDialog(null, (userInput + " = " + mToYd(doubleAmount) + " yd"));
		break;
		case "lb": JOptionPane.showMessageDialog(null, (userInput + " = " + lbToKg(doubleAmount) + " kg"));
		break;
		case "kg": JOptionPane.showMessageDialog(null, (userInput + " = " + kgToLb(doubleAmount) + " lb"));
		break;
		}
	}

}
