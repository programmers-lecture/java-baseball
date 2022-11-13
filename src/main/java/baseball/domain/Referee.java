package baseball.domain;

import java.util.List;

import static baseball.domain.Score.*;
import static baseball.domain.Score.BALL;

public class Referee {
    private final Balls comBalls;

    private Scores scores = new Scores();

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
            scores.increasePoint(Score.BALL);
        }
    }

    private void getStrike(Balls userBalls, int i) {
        if (comBalls.isStrike(userBalls, i)) {
            scores.increasePoint(Score.STRIKE);
        }
    }

    public boolean isOutPoint() {
        return scores.getPoint(STRIKE) == Balls.BALL_SIZE;
    }

    public void scoreReset() {
        scores.pointReset();
    }
    @Override
    public String toString() {
        if (scores.getPoint(STRIKE) == 0 && scores.getPoint(BALL) == 0) {
            return scores.getValue(NOTHING);
        }

        StringBuilder sb = new StringBuilder();
        if (scores.getPoint(BALL) > 0) {
            sb.append(scores.getPoint(BALL)).append(scores.getValue(BALL)).append(" ");
        }
        if (scores.getPoint(STRIKE) > 0) {
            sb.append(scores.getPoint(STRIKE)).append(scores.getValue(STRIKE));
        }
        return sb.toString();
    }
}