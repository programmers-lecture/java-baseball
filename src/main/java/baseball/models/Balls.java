package baseball.models;

import baseball.utils.RandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Balls {
    public static final int BALL_SIZE = 3;

    private List<Integer> balls;

    public Balls() {
        balls = new ArrayList<>();
    }

    public void createPlayerBalls(String[] playerNumber) {
        for(String number: playerNumber) {
            balls.add(Integer.parseInt(number));
        }
    }

    public void createComputerBalls() {
        balls = IntStream.generate(RandomUtil::createRandomNumber)
                .distinct()
                .limit(BALL_SIZE)
                .boxed()
                .collect(Collectors.toList());
    }

    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
    }
}
