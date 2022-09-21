package game.baesball.player;

import game.baesball.ball.Balls;
import game.baesball.ball.BallsHandler;

public class ComputerPlayer implements Player {

    private final BallsHandler ballsHandler = new BallsHandler();
    private Balls balls;

    public void playGame() {
        balls = ballsHandler.getRandomBalls();
    }

    public Balls getBalls() {
        return balls;
    }
}
