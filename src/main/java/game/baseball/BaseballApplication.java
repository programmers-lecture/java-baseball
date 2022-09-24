package game.baseball;

import game.baseball.game.Game;
import game.baseball.game.GameHandler;

public class BaseballApplication {

    public static void main(String[] args) {
        GameHandler game = new GameHandler();

        boolean gameContinue;
        do {
            gameContinue = game.playGameAndGetEndType(new Game());
        } while (gameContinue);
    }
}
