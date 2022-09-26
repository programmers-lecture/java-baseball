package baseball.contoller;

import baseball.domain.Balls;
import baseball.domain.Referee;
import baseball.util.RandomNumber;
import baseball.util.RandomNumberImpl;
import baseball.view.InputView;
import baseball.view.OutputView;

import static baseball.contoller.Game.GameType.Start;

public class Game {
    enum GameType {
        Start(1), End(2);

        private int typeValue;

        GameType(int typeValue) {
            this.typeValue = typeValue;
        }
    }

    private final InputView inputView = new InputView();
    private final RandomNumber randomNumber = new RandomNumberImpl();
    private Referee referee;

    public void run() {
        referee = new Referee(randomNumber.createRandomNumbers());
        do {
            referee.scoreReset();
            referee.getScore(Balls.createBalls(inputView.inputNumbersToList()));
            OutputView.printString(referee.toString());
        } while (!referee.isOutPoint());
    }

    public boolean userIsReplay() {
        OutputView.printAskReplay();
        return inputView.inputToInt() == Start.typeValue;
    }
}
