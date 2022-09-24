package game.baseball.ball;

import game.baseball.util.setting.GameSetting;

import java.util.Collections;
import java.util.List;

import static game.baseball.message.ExceptionMessage.*;
import static game.baseball.util.setting.GameSetting.*;

public class Balls {

    private final List<Integer> balls;

    public Balls(List<Integer> balls) {
        checkBallSizeOrThrow(balls);
        this.balls = balls;
    }

    private void checkBallSizeOrThrow(List<Integer> balls) {
        if (balls.size() != GAME_SETTING.getBallSize()) {
            throw new IllegalArgumentException(INCORRECT_BALL_SIZE.getErrorMessage());
        }
    }

    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
    }

}
