package game.baesball.player;

import game.baesball.ball.Balls;
import game.baesball.ball.BallsHandler;

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
