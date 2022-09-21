package game.baesball.ball;

public class Balls {

    private Integer ballOne;
    private Integer ballTwo;
    private Integer ballThree;

    public Balls(Integer ballOne, Integer ballTwo, Integer ballThree) {
        this.ballOne = ballOne;
        this.ballTwo = ballTwo;
        this.ballThree = ballThree;
    }

    public Integer getBallOne() {
        return ballOne;
    }

    public Integer getBallTwo() {
        return ballTwo;
    }

    public Integer getBallThree() {
        return ballThree;
    }
}
