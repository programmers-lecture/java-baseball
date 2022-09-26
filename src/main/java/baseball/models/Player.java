package baseball.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements User {
    private String[] playerNumber;
    private List<Integer> balls = new ArrayList<>();

    public Player(String[] playerNumber) {
        this.playerNumber = playerNumber;
        createBalls();
    }

    @Override
    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
    }

    private void createBalls() {
        for(String number: playerNumber) {
            balls.add(Integer.parseInt(number));
        }
    }
}
