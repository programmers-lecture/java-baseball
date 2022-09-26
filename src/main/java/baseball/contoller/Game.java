package baseball.contoller;

import baseball.domain.Balls;
import baseball.domain.Referee;
import baseball.domain.Score;
import baseball.util.RandomNumber;
import baseball.util.RandomNumberImpl;
import baseball.view.InputView;
import baseball.view.OutputView;

import static baseball.contoller.Game.GameType.Start;
import static baseball.domain.Score.*;

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
            Score.pointReset();
            referee.getScore(Balls.createBalls(inputView.inputNumbersToList()));
            OutputView.printString(this.toString());
        } while (!isOutPoint());
    }

    public boolean userIsReplay() {
        OutputView.printAskReplay();
        return inputView.inputToInt() == Start.typeValue;
    }

    private boolean isOutPoint() {
        return Score.getPoint(STRIKE) == Balls.BALL_SIZE;
    }

    @Override
    public String toString() {
        if (Score.getPoint(STRIKE) == 0 && Score.getPoint(BALL) == 0) {
            return NOTHING.getValue();
        }

        StringBuilder sb = new StringBuilder();
        if (Score.getPoint(BALL) > 0) {
            sb.append(Score.getPoint(BALL)).append(BALL.getValue()).append(" ");
        }
        if (Score.getPoint(STRIKE) > 0) {
            sb.append(Score.getPoint(STRIKE)).append(STRIKE.getValue());
        }
        return sb.toString();
    }

}
