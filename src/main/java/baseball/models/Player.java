package baseball.models;

import java.util.ArrayList;
import java.util.List;

public class Player implements User {
    private String[] playerNumber;
    private List<Integer> ball = new ArrayList<>();

    public Player(String[] playerNumber) {
        this.playerNumber = playerNumber;
        createBall();
    }

    @Override
    public List<Integer> getBall() {
        return ball;
    }

    @Override
    public void createBall() {
        for(String number: playerNumber) {
            ball.add(Integer.parseInt(number));
        }
    }
}
