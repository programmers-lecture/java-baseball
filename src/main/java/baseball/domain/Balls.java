package baseball.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Balls {

    private final List<Ball> balls;

    private Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public static Balls createBalls(List<String> numbers) {
        List<Ball> balls = numbers.stream().map(i -> (new Ball(Integer.parseInt(i))))
            .collect(Collectors.toList());
        return new Balls(balls);
    }


}
