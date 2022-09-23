package baseball;

import baseball.contoller.Game;

public class Application {
    public static void main(String[] args) {
        Game game = null;
        while (game.getIsReplay()) {
            game = new Game();
            game.run();
            game.userIsReplay();
        }
    }
}
