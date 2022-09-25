package baseballgame.controller;

import baseballgame.model.RandomNumber;
import baseballgame.service.RandomNumberGenerator;
import baseballgame.service.Referee;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final Referee referee = new Referee();

    public void run() {
        while (true) {
            ArrayList<Integer> userNumber = new ArrayList<>();
            RandomNumber randomNumber = randomNumberGenerator.generateRandomNumber();
            String gameResult = referee.judge(userNumber, new ArrayList<>(randomNumber.getRandomNumber()));

        }
    }
}
