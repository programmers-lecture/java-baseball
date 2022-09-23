package game.baseball.ball;

import game.baseball.util.RandomUtil;
import game.baseball.view.output.OutputView;

import static game.baseball.view.input.InputHandler.*;
import static game.baseball.view.input.InputMessage.INPUT_PLAYER_BALLS;

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
