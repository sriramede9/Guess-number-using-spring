package com.spring5.Guess_the_number_spring.Numbergenerator;

import java.util.Random;

public class NumberGeneratorimpl implements NumberGenerator {

	// filds

	private final Random random = new Random();

	private int maxNumber = 100;

	public int next() {
		// TODO Auto-generated method stub

		return random.nextInt(maxNumber);
	}

	public int getMaxNumber() {
		// TODO Auto-generated method stub
		return maxNumber;
	}

}
