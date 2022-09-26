package baseball;

import baseball.contoller.Game;

public class Application {
    public static void main(String[] args) {
        Game game;
        do {
            game = new Game();
            game.run();
        } while (game.userIsReplay());
    }
}