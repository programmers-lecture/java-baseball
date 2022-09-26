package baseball.models;

import baseball.utils.RandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
