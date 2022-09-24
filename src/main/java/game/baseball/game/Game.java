package game.baseball.game;

import game.baseball.player.ComputerPlayer;
import game.baseball.player.HumanPlayer;
import game.baseball.player.Player;

public class Game {

    private Player computerPlayer;
    private Player humanPlayer;
    private Referee referee;
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

    public void nextRound() {
        round++;
    }
}
