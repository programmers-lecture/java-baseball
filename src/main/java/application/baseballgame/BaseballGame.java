package application.baseballgame;

import application.baseballgame.gameresult.GameResult;
import application.baseballgame.player.Computer;
import application.baseballgame.player.User;
import application.numbergenerator.RandomNumberGenerator;

public class BaseballGame {
    public void run() {
        Computer computer = new Computer();
        computer.setNumbers(new RandomNumberGenerator());
        User user = new User();
        GameResult gameResult = new GameResult();
        while (!gameResult.isWin()) {
            user.setNumbers();
            gameResult.setThrowingResults(computer.getNumbers(), user.getNumbers());
            gameResult.printResult();
        }
    }
}
