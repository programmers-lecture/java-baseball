package baseballgame.controller;

import baseballgame.model.RandomNumber;
import baseballgame.service.RandomNumberGenerator;
import baseballgame.service.Referee;

import java.util.ArrayList;

public class BaseballGame {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final Referee referee = new Referee();

    public void run() {
        while (true) {
            ArrayList<Integer> userNumber = new ArrayList<>();
            RandomNumber randomNumber = randomNumberGenerator.generateRandomNumber();
            System.out.println("randomNumber = " + randomNumber.getRandomNumber());
            String gameResult = referee.judge(userNumber);
        }
    }
}
