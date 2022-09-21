package baseball.models;

import java.util.ArrayList;
import java.util.List;

public class Player implements User {
    private List<Integer> ball = new ArrayList<>();

    public Player(String[] playerNumber) {
        for(String number: playerNumber) {
            ball.add(Integer.parseInt(number));
        }
    }

    @Override
    public List<Integer> getBall() {
        return ball;
    }
}
