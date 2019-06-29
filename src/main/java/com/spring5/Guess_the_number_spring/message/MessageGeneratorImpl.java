package com.spring5.Guess_the_number_spring.message;

import com.spring5.Guess_the_number_spring.Game.Game;

public class MessageGeneratorImpl implements MessageGenerator {

	private Game game;

	private int guessCount = 5;

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public String getMainMessage() {
		// TODO Auto-generated method stub
		return "Number is between" + game.getSmallest() + "and" + game.getBiggest() + "Can you guess it?";
	}

	public String getResultMessage() {
		// TODO Auto-generated method stub
		if (game.isGameWon()) {
			return "Yes! you guessed it " + game.getNumber() + "is 100% locked";
		} else if (game.IsGameLost()) {
			return "you lost! the number is " + game.getNumber();
		} else if (game.isvalidNumberRange()) {
			return "the number is in invlaid  range";
		} else if (game.getRemainingGuesses() == guessCount) {
			return "what is your first guess";
		} else {
			String direction = "lower";

			if (game.getGeuss() < game.getNumber()) {
				direction = "higher";
			}
			return  direction+"! you have remaining guesses "+game.getRemainingGuesses()+"guesses left";
		}

	}

}
