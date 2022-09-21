package game.baesball;

import game.baesball.player.ComputerPlayer;
import game.baesball.player.HumanPlayer;
import game.baesball.player.Player;
import game.baesball.game.GameHandler;

public class BaseballApplication {

    public static void main(String[] args) {
        GameHandler game = new GameHandler();
        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();

        game.playGame(computerPlayer, humanPlayer, false, 0);
    }
}
