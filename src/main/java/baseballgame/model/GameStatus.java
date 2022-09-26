package baseballgame.model;

public enum GameStatus {
    // TODO: fuctional interface를 사용
    STRIKE(0),
    BALL(0),
    OUT(0),
    GAME_OVER(0);

    private Integer state;
    private static final int GAME_OVER_CONDITION = 3;

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
}
