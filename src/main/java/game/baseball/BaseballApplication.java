package game.baseball;

import game.baseball.player.ComputerPlayer;
import game.baseball.player.HumanPlayer;
import game.baseball.player.Player;
import game.baseball.game.GameHandler;

public class BaseballApplication {

    public static void main(String[] args) {
        GameHandler game = new GameHandler();
        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();

        game.playGame(computerPlayer, humanPlayer, false, 0);
    }
}
