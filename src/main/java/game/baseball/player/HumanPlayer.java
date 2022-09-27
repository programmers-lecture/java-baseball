package game.baseball.player;

import game.baseball.ball.Balls;
import game.baseball.util.number.NumberGenerator;

import static game.baseball.util.setting.PlayerSetting.HUMAN_NUMBER_GENERATOR;

public class HumanPlayer implements Player {

    private Balls balls;
    private final NumberGenerator numberGenerator;

    public HumanPlayer() {
        this.numberGenerator = HUMAN_NUMBER_GENERATOR.createNumberGenerator();
    }

    @Override
    public void playBall() {
        this.balls = new Balls(numberGenerator.generate());
    }

    public Balls getBalls() {
        return balls;
    }
}
