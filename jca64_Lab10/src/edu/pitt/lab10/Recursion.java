package edu.pitt.lab10;

import java.lang.reflect.Array;

public class Recursion {

	public static int sumOfDigits(int x) {

		int sum = 0;
		
		if(x > 0) {
			sum = (x%10) + sumOfDigits(x/10);
		}
		else {
			sum = 0;
		}
		return sum;
	}
	
	public static void printArrayElements(int a[], int index) {
		
		if(index < a.length) {
			System.out.println(a[index]);
			printArrayElements(a, index+1);
		}
	}
	static int counter = 0;
	
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		if (k == 0) {
			System.out.println("{" + out + " }");
		}
		for (int i = startIndex; i < a.length; i++) {
			printCombos(a, out + " " + a[i], i + 1, k - 1);
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {2, 3, 7, 8, 9};
		
		//printArrayElements(a, 0);
		
		printCombos(a, "", 0, 3);
		
	}
}
