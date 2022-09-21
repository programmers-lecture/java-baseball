package game.baesball.player;

import game.baesball.ball.Balls;
import game.baesball.ball.BallsHandler;

public class HumanPlayer extends Balls {

    private final BallsHandler ballsHandler = new BallsHandler();

    public void playGame() {
        setBalls(ballsHandler.getPlayerBalls());
    }
}
