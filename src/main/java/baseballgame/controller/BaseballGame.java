package baseballgame.controller;

import baseballgame.model.GameStatus;
import baseballgame.model.RandomNumber;
import baseballgame.service.ConfirmAdditionalGame;
import baseballgame.service.RandomNumberGenerator;
import baseballgame.service.Referee;
import baseballgame.service.ResultMessageGenerator;
import baseballgame.view.InputView;
import baseballgame.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final ResultMessageGenerator resultMessageGenerator = new ResultMessageGenerator();
    private final Referee referee = new Referee();

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void run() {
        while (true) {
            ArrayList<Integer> userNumber = new ArrayList<>();
            RandomNumber randomNumber = randomNumberGenerator.generateRandomNumber();

            referee.judge(userNumber, new ArrayList<>(randomNumber.getRandomNumber()));

            outputView.printMessage(resultMessageGenerator.generateJudgmentMessage());

            if (GameStatus.isGameOver()) {
                outputView.printGameOverMessage(GameStatus.STRIKE.getState());
                outputView.printConfirmMessage();
            }
        }
    }
}
