package game.baseball.util.setting;

public enum GameEndSetting {
    RESTART_GAME(1),
    END_GAME(2);

    private final int endType;

    GameEndSetting(int endType) {
        this.endType = endType;
    }

    public int getEndType() {
        return endType;
    }
}
