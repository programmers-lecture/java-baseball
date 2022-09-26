package baseballgame.controller;

import baseballgame.model.ConfirmType;
import baseballgame.model.GameStatus;
import baseballgame.model.RandomNumber;
import baseballgame.service.RandomNumberGenerator;
import baseballgame.service.Referee;
import baseballgame.service.ResultMessageGenerator;
import baseballgame.view.InputView;
import baseballgame.view.OutputView;

import java.util.ArrayList;

public class BaseballGame {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final ResultMessageGenerator resultMessageGenerator = new ResultMessageGenerator();
    private final Referee referee = new Referee();

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void run() {
        while (true) {
            ArrayList<Integer> userNumber = inputView.readNumber();
            RandomNumber randomNumber = randomNumberGenerator.generateRandomNumber();

            referee.judge(userNumber, new ArrayList<>(randomNumber.getRandomNumber()));
            outputView.printMessage(resultMessageGenerator.generateJudgmentMessage());
            GameStatus.initialize();

            if (GameStatus.isGameOver()) {
                outputView.printGameOverMessage(GameStatus.STRIKE.getState());
                outputView.printConfirmMessage();

                ConfirmType confirmType = inputView.readConfirmType();
                if (confirmType == ConfirmType.DECLINE) {
                    break;
                }
            }

            GameStatus.initialize();
        }
    }
}
