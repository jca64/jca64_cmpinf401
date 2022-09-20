package edu.pitt.lab4;

import javax.swing.JOptionPane;

public class Floor {
	public static void main(String[] args) {

		int val = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the value you want to calculate the log of: "));
		int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the base value: "));
		
		if(val <= 0) {
			val = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a valid value greater than 0: "));
		}
		if(base <= 1) {
			base = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a valid value greater than 1: "));
		}
		
		int counter = 0;
		while(val >= base) {
			val = val/base;
			counter++;
		}
		
		JOptionPane.showMessageDialog(null, counter + " divisions");
	}

}
