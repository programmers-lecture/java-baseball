package baseball.contoller;

import baseball.domain.Balls;
import baseball.domain.Referee;
import baseball.domain.Score;
import baseball.util.RandomNumber;
import baseball.util.RandomNumberImpl;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Game {

    public static final String REPLAY_NUMBER = "1";
    private InputView inputView = new InputView();
    private RandomNumber randomNumber = new RandomNumberImpl();
    private Referee referee;
    private static boolean isReplay = true;

    public void run() {
        referee = new Referee(randomNumber.createRandomNumbers());
        Score.initPoint();
        while (!Score.isOutPoint()) {
            Score.initPoint();
            referee.getScore(Balls.createBalls(inputView.inputNumbersToList()));
            OutputView.printString(Score.pointToString());
        }
    }

    public static boolean getIsReplay() {
        return isReplay;
    }

    public void userIsReplay() {
        OutputView.printAskReplay();
        if (inputView.inputLine().equals(REPLAY_NUMBER)) {
            this.isReplay = true;
            return;
        }
        this.isReplay = false;
    }
}
