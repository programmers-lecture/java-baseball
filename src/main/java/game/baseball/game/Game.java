package game.baseball.game;

import game.baseball.player.ComputerPlayer;
import game.baseball.player.HumanPlayer;
import game.baseball.player.Player;

public class Game {

    private final Player computerPlayer;
    private final Player humanPlayer;
    private final Referee referee;
    private int round;

    public Game() {
        computerPlayer = new ComputerPlayer();
        humanPlayer = new HumanPlayer();
        referee = new Referee();
    }

    public Player getComputerPlayer() {
        return computerPlayer;
    }

    public Player getHumanPlayer() {
        return humanPlayer;
    }

    public Referee getReferee() {
        return referee;
    }

}
