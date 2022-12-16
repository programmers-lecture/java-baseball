package application.baseball;

public enum GameStatus {
    PREPARING(0),
    PLAYING(1),
    END(2);

    private final int gameStatus;

    GameStatus(int gameStatus) {
        this.gameStatus = gameStatus;
    }
    public Integer getCode() {
        return gameStatus;
    }
}
