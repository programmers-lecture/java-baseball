package baseball.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements User {
    private Balls balls;

    public Player(String[] playerNumber) {
        balls = new Balls();
        balls.createPlayerBalls(playerNumber);
    }

    @Override
    public List<Integer> getBalls() {
        return balls.getBalls();
    }
}
