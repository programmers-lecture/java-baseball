package baseball.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Balls {

    public static final int BALL_SIZE = 3;

    private final List<Ball> balls;

    private Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public static Balls createBalls(List<Integer> numbers) {
        List<Ball> balls = numbers.stream().map(i -> (new Ball(i)))
            .collect(Collectors.toList());
        return new Balls(balls);
    }

    public boolean getStrike(Balls userBalls, int index) {
        if (balls.get(index).equals(userBalls.balls.get(index))) {
            return true;
        }
        return false;
    }


    public boolean getBall(Balls userBalls, int i) {
        if (balls.contains(userBalls.balls.get(i)) && !getStrike(userBalls, i)) {
            return true;
        }
        return false;
    }
}
