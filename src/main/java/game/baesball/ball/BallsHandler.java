package game.baesball.ball;

import game.baesball.util.RandomUtil;
import game.baesball.view.output.OutputView;

import static game.baesball.view.input.InputHandler.*;
import static game.baesball.view.input.InputMessage.INPUT_PLAYER_BALLS;

public class BallsHandler {

    public Balls getRandomBalls() {
        return createBalls(new RandomUtil().makeThreeRandoms());
    }

    public Balls getPlayerBalls() {
        new OutputView().sendMessage(INPUT_PLAYER_BALLS.getMessage());
        return createBalls(
                convertToIntegerArray(
                        splitBySpace(
                                readLine()
        )));
    }

    public Balls createBalls(int[] balls) {
        return new Balls(balls[0], balls[1], balls[2]);
    }

}
