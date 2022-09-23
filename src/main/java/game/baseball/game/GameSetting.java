package game.baseball.game;

public enum GameSetting {

    GAME_SETTING_VERSION_01(3, 1, 9, 3);

    private final int ballSize;
    private final int minBallNumber;
    private final int maxBallNumber;
    private final int maxGameRound;

    GameSetting(int ballSize, int minBallNumber, int maxBallNumber, int maxGameRound) {
        this.ballSize = ballSize;
        this.minBallNumber = minBallNumber;
        this.maxBallNumber = maxBallNumber;
        this.maxGameRound = maxGameRound;
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

    public int getMaxGameRound() {
        return maxGameRound;
    }
}
