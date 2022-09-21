package baseball.domain;

import java.util.List;

public class Referee {


    private final Balls comBalls;

    private int strike;
    private int ball;


    public Referee(List<Integer> comBalls) {
        this.comBalls = Balls.createBalls(comBalls);
    }


    public void getScore(Balls userBalls) {
        for (int i = 0; i < Balls.BALL_SIZE; i++) {
            isStrike(userBalls, i);
            isBall(userBalls, i);
        }
    }

    private void isBall(Balls userBalls, int i) {
        if (comBalls.getBall(userBalls, i)) {
            ball++;
        }
    }

    private void isStrike(Balls userBalls, int i) {
        if (comBalls.getStrike(userBalls, i)) {
            strike++;
        }
    }


}
