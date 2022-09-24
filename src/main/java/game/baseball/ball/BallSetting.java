package game.baseball.ball;

public enum BallSetting {

    BALL_SETTING_VERSION_01(3, 1, 9);

    private final int ballSize;
    private final int minBallNumber;
    private final int maxBallNumber;

    BallSetting(int ballSize, int minBallNumber, int maxBallNumber) {
        this.ballSize = ballSize;
        this.minBallNumber = minBallNumber;
        this.maxBallNumber = maxBallNumber;
    }

    public int getBallSize() {
        return ballSize;
    }

    public int getMinBallNumber() {
        return minBallNumber;
    }

    public int getMaxBallNumber() {
        return maxBallNumber;
    }

}
