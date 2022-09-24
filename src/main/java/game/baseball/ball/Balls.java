package game.baseball.ball;

import java.util.Collections;
import java.util.List;

public class Balls {

    private final List<Integer> balls;

    public Balls(List<Integer> balls) {
        this.balls = balls;
    }

    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
    }

}
