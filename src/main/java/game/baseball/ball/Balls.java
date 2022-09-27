package game.baseball.ball;

import java.util.Collections;
import java.util.List;

import static game.baseball.message.ExceptionMessage.INCORRECT_BALL_SIZE;
import static game.baseball.util.setting.BallSetting.BALL_LEAST_SIZE;

public class Balls {

    private final List<Integer> balls;

    public Balls(List<Integer> balls) {
        checkBallSizeOrThrow(balls);
        this.balls = balls;
    }

    private void checkBallSizeOrThrow(List<Integer> balls) {
        if (balls.size() != BALL_LEAST_SIZE.getBallSetting()) {
            throw new IllegalArgumentException(INCORRECT_BALL_SIZE.getErrorMessage());
        }
    }

    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
    }

}
