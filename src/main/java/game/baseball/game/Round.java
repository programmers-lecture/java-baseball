package game.baseball.game;

public class Round {

    private int round;

    public Round() {
        this.round = 0;
    }

    public int getRound() {
        return round;
    }

    public void nextRound() {
        this.round++;
    }

}
