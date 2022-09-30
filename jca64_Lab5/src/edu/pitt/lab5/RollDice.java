package edu.pitt.lab5;

import java.util.Random;

public class RollDice {

	static void rollDice(int rollCount, Random random) {
		
		int[] count = new int[11];		
		
		for(int i=0; i<rollCount; i++) {
			int dice1 = random.nextInt(6) + 1;
			int dice2 = random.nextInt(6) + 1;
			
			count[(dice1+dice2) - 2]++;
		}
		
		for(int j=0; j<count.length; j++) {
			System.out.println(j+2 + ": " + count[j] + " " + count[j] + "/" + rollCount + " " + (count[j]*100/rollCount) + "%");
		}
	}
	public static void main(String[] args) {
		Random random = new Random();
		rollDice(100000, random);
	}
}

