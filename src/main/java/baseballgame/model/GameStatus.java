package baseballgame.model;

public enum GameStatus {
    // TODO: fuctional interface를 사용
    BALL(0),
    STRIKE(0),
    OUT(0),
    GAME_OVER(0);

    private Integer state;
    private static final int GAME_OVER_CONDITION = 3;
    private static final int NOTHING = 0;

    GameStatus(Integer state) {
        this.state = state;
    }

    public void count() {
        this.state++;
    }

    public Integer getState() {
        return this.state;
    }

    public static boolean isGameOver() {
        return STRIKE.state == GAME_OVER_CONDITION;
    }

    public static boolean isNothing() {
        return STRIKE.state == NOTHING && BALL.state == NOTHING;
    }

    public static boolean isZero(GameStatus gameStatus) {
        return gameStatus.state == NOTHING;
    }
}
