package game.baseball.ball;

import game.baseball.util.NumberGenerator;

import java.util.Arrays;

public class BallsHandler {

    public Balls getBalls(NumberGenerator numberGenerator, int numberSize, int minNumber, int maxNumber) {
        return new Balls(Arrays.asList(
                numberGenerator.generate(numberSize, minNumber, maxNumber),
                numberGenerator.generate(numberSize, minNumber, maxNumber),
                numberGenerator.generate(numberSize, minNumber, maxNumber))
        );
    }

}
