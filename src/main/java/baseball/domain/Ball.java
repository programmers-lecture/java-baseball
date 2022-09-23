package baseball.domain;

import java.util.Objects;

public class Ball {

    private static final String BALL_RANGE_MSG = "숫자의 범위는 1~9입니다.";
    public static final int MIN_BALL_NUMBER = 1;
    public static final int MAX_BALL_NUMBER = 9;
    private final int ball;

    public Ball(int ball) {
        this.ball = ballValidation(ball);
    }

    private int ballValidation(int ballNumber) {
        if (ballNumber >= MIN_BALL_NUMBER && MAX_BALL_NUMBER >= ballNumber) {
            return ballNumber;
        }
        throw new IllegalArgumentException(BALL_RANGE_MSG);
    }

    @Override
    public boolean equals(Object otherBall) {
        if (this == otherBall) {
            return true;
        }
        if (otherBall == null || getClass() != otherBall.getClass()) {
            return false;
        }
        return ball == ((Ball) otherBall).ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball);
    }

}
