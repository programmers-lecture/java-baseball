package game.baesball.ball;

import game.baesball.util.RandomUtil;

import static game.baesball.view.input.InputHandler.*;

public class BallsHandler {

    public Balls getRandomBalls() {
        return createBalls(new RandomUtil().makeThreeRandoms());
    }

    public Balls getPlayerBalls() {
        return createBalls(
                convertToIntegerArray(
                        splitBySpace(
                                readLine()
        )));
    }

    public Balls createBalls(Integer[] balls) {
        return new Balls(balls[0], balls[1], balls[2]);
    }

    public void checkBalls() {

    }
}
