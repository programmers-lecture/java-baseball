package com.example.baseball;

import com.example.baseball.game.BaseBallGame;

public class BaseBallApplication {
	public static void main(String[] args) {
		BaseBallGame baseBallGame = new BaseBallGame(null, null);
		baseBallGame.run(null);
	}
}
