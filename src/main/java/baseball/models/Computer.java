package baseball.models;

import baseball.utils.RandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Computer implements User {
    private List<Integer> balls;

    public Computer() {
        balls = new ArrayList<>();
        createBalls();
    }

    @Override
    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
    }

    private void createBalls() {
        balls = IntStream.generate(RandomUtil::createRandomNumber)
                .distinct()
                .limit(Baseball.BALL_SIZE)
                .boxed()
                .collect(Collectors.toList());
    }
}
