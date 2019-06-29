package com.spring5.Guess_the_number_spring.Game;

public interface Game {

	int getNumber();

	int getGeuss();

	void setGeuss(int guess);

	int getSmallest();

	int getBiggest();

	int getRemainingGuesses();

	void reset();

	void Check();

	boolean isGameWon();

	boolean IsGameLost();
	
	public boolean isvalidNumberRange();
}
