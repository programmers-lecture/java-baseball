package game.baseball.player;

import game.baseball.ball.Balls;
import game.baseball.util.number.NumberGenerator;

import static game.baseball.util.setting.PlayerSetting.COMPUTER_NUMBER_GENERATOR;

public class ComputerPlayer implements Player {

    private Balls balls;
    private final NumberGenerator numberGenerator;

    public ComputerPlayer() {
        this.numberGenerator = COMPUTER_NUMBER_GENERATOR.createNumberGenerator();
    }

    public void playBall() {
        this.balls = new Balls(numberGenerator.generate());
    }

    public Balls getBalls() {
        return balls;
    }
}
