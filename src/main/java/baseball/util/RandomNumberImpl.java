package baseball.util;

import baseball.domain.Ball;
import baseball.domain.Balls;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumberImpl implements RandomNumber {


    @Override
    public List<Integer> createRandomNumbers() {
        return Stream.generate(() -> (int) (Math.random() * Ball.MAX_BALL_NUMBER) + Ball.MIN_BALL_NUMBER)
            .distinct()
            .limit(Balls.BALL_SIZE)
            .collect(Collectors.toList());
    }
}
