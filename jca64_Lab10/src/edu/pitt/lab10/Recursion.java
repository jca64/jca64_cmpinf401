package edu.pitt.lab10;

public class Recursion {

	public static int sumOfDigits(int x) {

		int sum = 0;
		
		if(x > 0) {
			sum = (x%10) + sumOfDigits(x/10);
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
	
	// "All truths are easy to understand once they are discovered; the point is to discover them." - Galileo Galilei
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		if (k == 0) {
			System.out.println("{" + out + " }");
		}
		for (int i=startIndex; i<a.length; i++) {
			printCombos(a, out + " " + a[i], i + 1, k - 1);
		}
	}
}
