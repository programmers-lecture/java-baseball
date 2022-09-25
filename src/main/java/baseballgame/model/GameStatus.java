package baseballgame.model;

public enum GameStatus {
    // TODO: fuctional interface를 사용한 Enum조합
    STRIKE(0),
    BALL(0),
    OUT(0),
    GAME_OVER(0);

    private Integer state;

    GameStatus(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }

    public void count() {
        this.state++;
    }
}
