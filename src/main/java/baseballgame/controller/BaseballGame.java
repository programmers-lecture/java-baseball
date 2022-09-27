package baseballgame.controller;

import baseballgame.model.ConfirmType;
import baseballgame.model.GameStatus;
import baseballgame.model.RandomNumber;
import baseballgame.model.UserNumber;
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
        RandomNumber randomNumber = randomNumberGenerator.generateRandomNumber();

        while (!GameStatus.isGameOver()) {
            GameStatus.initialize();
            UserNumber userNumber = new UserNumber(inputView.readNumber());

            referee.judge(userNumber.getUserNumber(), new ArrayList<>(randomNumber.getRandomNumber()));
            outputView.printMessage(resultMessageGenerator.createNewResultMessage());

            randomNumber = checkGameOver(randomNumber);
        }
    }

    private RandomNumber checkGameOver(RandomNumber randomNumber) {
        if (GameStatus.isGameOver()) {
            outputView.printGameOverMessage(GameStatus.STRIKE.getState());
            outputView.printConfirmMessage();
            randomNumber = confirmRestart(randomNumber);
        }
        return randomNumber;
    }

    private RandomNumber confirmRestart(RandomNumber randomNumber) {
        ConfirmType confirmType = inputView.readConfirmType();

        if (confirmType == ConfirmType.CONFIRM) {
            inputView.clearInput();
            return randomNumberGenerator.generateRandomNumber();
        }
        return terminateGame(randomNumber);
    }

    private RandomNumber terminateGame(RandomNumber randomNumber) {
        outputView.printGameExitMessage();
        System.exit(0);
        return randomNumber;
    }
}
