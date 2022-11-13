package game.baseball.util.setting;

public enum BallSetting {

    BALL_LEAST_SIZE(3),
    BALL_MIN_NUMBER(1),
    BALL_MAX_NUMBER(9);

    private final int ballSetting;

    BallSetting(int ballSetting) {
        this.ballSetting = ballSetting;
    }

    public int getBallSetting() {
        return ballSetting;
    }

}
