package game.baesball;

import game.baesball.player.ComputerPlayer;
import game.baesball.player.HumanPlayer;
import game.baesball.player.Player;
import game.baesball.rule.Game;

public class BaseballApplication {

    public static void main(String[] args) {
        Game game = new Game();
        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();

        game.playGame(computerPlayer, humanPlayer);
    }
}
