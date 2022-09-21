package baseball.models;

import baseball.utils.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class Computer implements User {
    private List<Integer> ball = new ArrayList<>();

    public Computer() {
        createBall();
    }

    @Override
    public List<Integer> getBall() {
        return ball;
    }

    @Override
    public void createBall() {
        while(ball.size() < Baseball.BALL_SIZE) {
            int randomNumber = RandomUtil.createRandomNumber();
            if(!ball.contains(randomNumber))
                ball.add(randomNumber);
        }
    }
}
