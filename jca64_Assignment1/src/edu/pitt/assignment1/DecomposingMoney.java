package edu.pitt.assignment1;
import javax.swing.JOptionPane;
public class DecomposingMoney {
	
	public static void main(String[] args) {
		
		String dollars = JOptionPane.showInputDialog("Enter a dollar amount between 1-9999");
		
		int d = Integer.parseInt(dollars);
		
		int grand = d/1000;
		int bens = (d%1000)/100;
		int saw = ((d%1000)%100)/10;
		int bucks = (((d%1000)%100)%10);
		
		JOptionPane.showMessageDialog(null, "You have: \n" + grand + " grands \n" + bens + " Benjamins \n" + saw + " sawbucks \n" + bucks + " bucks");
	}

}
