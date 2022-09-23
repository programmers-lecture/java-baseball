package game.baseball.player;

import game.baseball.ball.Balls;
import game.baseball.ball.BallsHandler;

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
