package com.spring5.Guess_the_number_spring.Game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spring5.Guess_the_number_spring.Numbergenerator.NumberGenerator;

public class GameImpl implements Game {

	private static final Logger log = LoggerFactory.getLogger(GameImpl.class);

	private int counter;

	private NumberGenerator numberGenerator;

	private int guessCount = 5;

	private int number;

	private int guess;

	private int smallest;

	private int biggest;

	private int remaininggeuesses;

	private boolean validnumberRange = true;

	
	public NumberGenerator getNumberGenerator() {
		return numberGenerator;
	}

	public void setNumberGenerator(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}

	public int getNumber() {
		// TODO Auto-generated method stub
		return number;
	}

	public int getGeuss() {
		// TODO Auto-generated method stub
		return guess;
	}

	public void setGeuss(int guess) {
		// TODO Auto-generated method stub
		this.guess = guess;
	}

	public int getSmallest() {
		// TODO Auto-generated method stub
		return smallest;
	}

	public int getBiggest() {
		// TODO Auto-generated method stub
		return biggest;
	}

	public int getRemainingGuesses() {
		// TODO Auto-generated method stub
		return remaininggeuesses;
	}

	public void reset() {
		// TODO Auto-generated method stub
		smallest = 0;
		guess = 0;
		remaininggeuesses = guessCount;
		biggest = numberGenerator.getMaxNumber();
		number = numberGenerator.next();

		System.out.println(number + "that is set now");

	}

	public void Check() {
		// TODO Auto-generated method stub

		checkValidNumberRange();

		if (validnumberRange) {
			if (guess > number) {
				biggest = guess - 1;
			}
			if (guess < number) {
				smallest = guess + 1;
			}
		}
		remaininggeuesses--;
	}

	public boolean isGameWon() {
		// TODO Auto-generated method stub
		return guess == number;
	}

	public boolean IsGameLost() {
		// TODO Auto-generated method stub
		return !isGameWon() && remaininggeuesses <= 0;
	}

	public boolean isvalidNumberRange() {
		// TODO Auto-generated method stub
		return validnumberRange;
	}

	private void checkValidNumberRange() {

		validnumberRange = (guess >= smallest) && (guess <= biggest);

	}

}
