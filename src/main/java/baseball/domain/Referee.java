package baseball.domain;

import java.util.List;

public class Referee {

    private final Balls comBalls;

    public Referee(List<Integer> comBalls) {
        this.comBalls = Balls.createBalls(comBalls);
    }

    public void getScore(Balls userBalls) {
        for (int i = 0; i < Balls.BALL_SIZE; i++) {
            getStrike(userBalls, i);
            getBall(userBalls, i);
        }
    }

    private void getBall(Balls userBalls, int i) {
        if (comBalls.isBall(userBalls, i)) {
            Score.BALL.increaseScore();
        }
    }

    private void getStrike(Balls userBalls, int i) {
        if (comBalls.isStrike(userBalls, i)) {
            Score.STRIKE.increaseScore();
        }
    }
}