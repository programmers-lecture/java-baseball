package game.baseball.setting;

import game.baseball.player.Player;
import game.baseball.util.NumberGenerator;

import static game.baseball.setting.BallSetting.*;

public enum GameSetting {

    GAME_SETTING(
            3,
            new BallSetting(),
            new PlayerSetting()
    );

    private final int maxGameRound;
    private final BallSetting ballSetting;
    private final PlayerSetting playerSetting;

    GameSetting(int maxGameRound, BallSetting ballSetting, PlayerSetting playerSetting) {
        this.maxGameRound = maxGameRound;
        this.ballSetting = ballSetting;
        this.playerSetting = playerSetting;
    }

    public int getMaxGameRound() {
        return maxGameRound;
    }

    public int getBallSize() {
        return ballSetting.getBallSize();
    }

    public int getMaxBallNumber() {
        return ballSetting.getMaxBallNumber();
    }

    public int getMinBallNumber() {
        return ballSetting.getMinBallNumber();
    }

    public NumberGenerator getHumanPlayerNumberGenerator() {
        return playerSetting.getHumanNumberGenerator();
    }

    public NumberGenerator getComputerPlayerNumberGenerator() {
        return playerSetting.getComputerNumberGenerator();
    }

}
