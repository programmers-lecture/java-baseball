package baseball.models;

import baseball.utils.RandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Computer implements User {
    private List<Integer> balls = new ArrayList<>();

    public Computer() {
        createBalls();
    }

    @Override
    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
    }

    @Override
    public void createBalls() {
        while(balls.size() < Baseball.BALL_SIZE) {
            int randomNumber = RandomUtil.createRandomNumber();
            if(!balls.contains(randomNumber))
                balls.add(randomNumber);
        }
    }
}
