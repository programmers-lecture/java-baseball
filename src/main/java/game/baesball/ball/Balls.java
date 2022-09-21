package game.baesball.ball;

public class Balls {

    private Integer ballOne;
    private Integer ballTwo;
    private Integer ballThree;

    public Balls() {
    }

    public Balls(Integer ballOne, Integer ballTwo, Integer ballThree) {
        this.ballOne = ballOne;
        this.ballTwo = ballTwo;
        this.ballThree = ballThree;
    }

    private Integer getBallOne() {
        return ballOne;
    }

    private Integer getBallTwo() {
        return ballTwo;
    }

    private Integer getBallThree() {
        return ballThree;
    }

}
