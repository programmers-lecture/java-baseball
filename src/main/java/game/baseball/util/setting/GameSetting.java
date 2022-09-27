package game.baseball.util.setting;

public enum GameSetting {

    GAME_SETTING(3);

    private final int maxGameRound;

    GameSetting(int maxGameRound) {
        this.maxGameRound = maxGameRound;
    }

    public int getMaxGameRound() {
        return maxGameRound;
    }

}
