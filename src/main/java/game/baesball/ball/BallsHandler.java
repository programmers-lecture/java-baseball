package game.baesball.ball;

import game.baesball.view.input.InputHandler;

import static game.baesball.view.input.InputHandler.*;

public class BallsHandler {

    public Balls getRandomBalls() {
        return null;
    }

    public Balls getPlayerBalls() {
        Integer[] tempBalls = convertToIntegerArray(splitBySpace(readLine()));
        return new Balls(tempBalls[0], tempBalls[1], tempBalls[2]);
    }

    public void checkBalls() {

    }
}
