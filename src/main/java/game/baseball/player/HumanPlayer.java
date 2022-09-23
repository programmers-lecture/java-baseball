package game.baseball.player;

import game.baseball.ball.Balls;
import game.baseball.ball.BallsHandler;

public class HumanPlayer implements Player {

    private final BallsHandler ballsHandler = new BallsHandler();
    private Balls balls;

    public void playGame() {
        balls = ballsHandler.getPlayerBalls();
    }

    public Balls getBalls() {
        return balls;
    }
}
