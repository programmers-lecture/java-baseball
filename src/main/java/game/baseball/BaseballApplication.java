package game.baseball;

import game.baseball.game.Game;
import game.baseball.game.GameHandler;

public class BaseballApplication {

    public static void main(String[] args) {
        boolean gameContinue = true;
        GameHandler game = new GameHandler();
        while (gameContinue) {
            gameContinue = game.playGameAndGetEndType(new Game());
        }
    }
}
