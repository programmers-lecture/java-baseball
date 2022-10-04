package game.baseball;

import game.baseball.game.GameController;
import game.baseball.game.Referee;
import game.baseball.game.Round;
import game.baseball.player.ComputerPlayer;
import game.baseball.player.HumanPlayer;

public class BaseballApplication {

    public static void main(String[] args) {
        GameController controller = new GameController();

        boolean gameContinue;
        do {
            gameContinue =
                    controller.playGameAndGetEndType(
                            new ComputerPlayer(),
                            new HumanPlayer(),
                            new Referee(),
                            new Round());
        } while (gameContinue);
    }
}
