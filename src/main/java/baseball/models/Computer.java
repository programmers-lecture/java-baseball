package baseball.models;

import java.util.List;

public class Computer implements User {
    private Balls balls;

    public Computer() {
        balls = new Balls();
        balls.createComputerBalls();
    }

    @Override
    public List<Integer> getBalls() {
        return balls.getBalls();
    }
}
