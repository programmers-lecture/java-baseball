package game.baseball.player;

import game.baseball.ball.Balls;
import game.baseball.util.NumberGenerator;

import static game.baseball.setting.GameSetting.GAME_SETTING;

public class ComputerPlayer implements Player {

    private Balls balls;
    private final NumberGenerator numberGenerator;

    public ComputerPlayer() {
        this.numberGenerator = GAME_SETTING.getComputerPlayerNumberGenerator();
    }

    public void playBall() {
        this.balls = new Balls(numberGenerator.generate());
    }

    public Balls getBalls() {
        return balls;
    }
}
