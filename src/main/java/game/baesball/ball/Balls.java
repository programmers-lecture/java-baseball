package game.baesball.ball;

public class Balls {

    private int ballOne;
    private int ballTwo;
    private int ballThree;

    public Balls() {
    }

    public Balls(int ballOne, int ballTwo, int ballThree) {
        this.ballOne = ballOne;
        this.ballTwo = ballTwo;
        this.ballThree = ballThree;
    }

    public int getBallOne() {
        return ballOne;
    }

    public int getBallTwo() {
        return ballTwo;
    }

    public int getBallThree() {
        return ballThree;
    }

    public int[] getBalls() {
        return new int[] {ballOne, ballTwo, ballThree};
    }

    @Override
    public String toString() {
        return "Balls{" +
                "ballOne=" + ballOne +
                ", ballTwo=" + ballTwo +
                ", ballThree=" + ballThree +
                '}';
    }
}
