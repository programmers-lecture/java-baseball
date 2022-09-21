package baseball.domain;

import java.util.List;

public class Referee {

    private Balls userBalls;

    private final Balls comBalls;


    public Referee(List<Integer> comBalls) {
        this.comBalls = Balls.createBalls(comBalls);
    }



}
