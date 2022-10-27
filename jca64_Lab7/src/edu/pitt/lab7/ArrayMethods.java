package edu.pitt.lab7;

import javax.swing.JOptionPane;

public class ArrayMethods {
	
	public static double max(double[] data) {
		
		double max = data[0];
		
		for(double d: data) {
			if(d > max) {
				max = d;
			}
		}
		return max;
	}
	
	public static double min(double[] data) {
		
		double min = data[0];
		
		for(double d: data) {
			if(d < min) {
				min = d;
			}
		}
		return min;
	}
	
	public static double sum(double[] data) {
		double sum = 0;
		
		for(double d : data) {
			sum += d;
		}
		return sum;
	}
	
	public static double ave(double[] data) {
		
		return (sum(data)/data.length);
	}
	
	public static void main(String[] args) {
		
		String strAmount = JOptionPane.showInputDialog("How many items will be entered?");
		
		int amount = Integer.parseInt(strAmount);
		
		double[] data = new double[amount];
		
		for(int i=0; i<data.length; i++) {
			data[i] = Math.random();
		}
		
		System.out.print("Max: " + max(data) + "\n" + "Min: " + min(data) + "\n" + "Sum: " + sum(data) + "\n" + "Average: " + ave(data));
	}
}
