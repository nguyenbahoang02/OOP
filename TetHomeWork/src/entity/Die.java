package entity;

import java.util.Random;

public class Die {
	private int number[] = {1, 2, 3, 4, 5, 6};
	
	public Die(int luckyNumber) {
		if(luckyNumber!=1) {
			number[luckyNumber-1] = 1;
			number[0] = luckyNumber;
		}
	}
	
	public int roll() {
		Random random = new Random();
		int diceRoll = random.nextInt(100-1)+1;
		if(diceRoll>=1&&diceRoll<=20) {
			return number[0];
		}
		int counter=0;
		while(diceRoll>20) {
			diceRoll-=16;
			counter++;
		}
		return number[counter];
	}
}
