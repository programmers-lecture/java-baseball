package game.baseball.player;

import game.baseball.ball.Balls;

public class ComputerPlayer implements Player {

    private Balls balls;

    public void setBalls(Balls balls) {
        this.balls = balls;
    }

    public Balls getBalls() {
        return balls;
    }
}
