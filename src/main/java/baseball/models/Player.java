package baseball.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements User {
    private List<Integer> balls;

    public Player(String[] playerNumber) {
        balls = new ArrayList<>();
        createBalls(playerNumber);
    }

    @Override
    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
    }

    private void createBalls(String[] playerNumber) {
        for(String number: playerNumber) {
            balls.add(Integer.parseInt(number));
        }
    }
}
