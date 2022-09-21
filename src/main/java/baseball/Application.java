package baseball;

import baseball.contoller.Game;

public class Application {

    private static boolean playGame = true;

    private static Game game;
    public static void main(String[] args) {
        while (game.getIsReplay()) {
            game = new Game();
            game.run();
            game.userIsReplay();
        }
    }


}
