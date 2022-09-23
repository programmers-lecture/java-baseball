package game.baseball.ball;

import game.baseball.util.NumberGenerator;

public class BallsHandler {

    public Balls getBalls(NumberGenerator numberGenerator) {
        return new Balls(numberGenerator.generate());
    }

}
