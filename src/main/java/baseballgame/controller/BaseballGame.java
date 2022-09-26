package baseballgame.controller;

import baseballgame.model.RandomNumber;
import baseballgame.service.RandomNumberGenerator;
import baseballgame.service.Referee;
import baseballgame.service.ResultMessageGenerator;
import baseballgame.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final ResultMessageGenerator resultMessageGenerator = new ResultMessageGenerator();
    private final Referee referee = new Referee();

    private final OutputView outputView = new OutputView();

    public void run() {
        while (true) {
            ArrayList<Integer> userNumber = new ArrayList<>();
            RandomNumber randomNumber = randomNumberGenerator.generateRandomNumber();
            referee.judge(userNumber, new ArrayList<>(randomNumber.getRandomNumber()));
            outputView.printMessage(resultMessageGenerator.generateJudgmentMessage());
        }
    }
}
