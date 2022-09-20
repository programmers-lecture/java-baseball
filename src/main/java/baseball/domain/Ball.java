package baseball.domain;

import java.util.Objects;

public class Ball {

    private final int ball;

    public Ball(int ball) {
        this.ball = ball;
    }

    @Override
    public boolean equals(Object otherBall) {
        if (this == otherBall) {
            return true;
        }
        if (otherBall == null || getClass() != otherBall.getClass()) {
            return false;
        }
        return ball == ((Ball)otherBall).ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball);
    }
}
