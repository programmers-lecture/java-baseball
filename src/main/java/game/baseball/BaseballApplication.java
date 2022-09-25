package game.baseball;

import game.baseball.game.GameHandler;
import game.baseball.game.Referee;
import game.baseball.game.Round;
import game.baseball.player.ComputerPlayer;
import game.baseball.player.HumanPlayer;

public class BaseballApplication {

    public static void main(String[] args) {
        GameHandler game = new GameHandler();

        boolean gameContinue;
        do {
            gameContinue =
                    game.playGameAndGetEndType(
                            new ComputerPlayer(),
                            new HumanPlayer(),
                            new Referee(),
                            new Round());
        } while (gameContinue);
    }
}
