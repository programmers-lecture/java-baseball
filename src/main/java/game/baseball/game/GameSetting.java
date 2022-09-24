package game.baseball.game;

import game.baseball.ball.BallSetting;
import game.baseball.player.Player;
import game.baseball.player.PlayerSetting;
import game.baseball.util.NumberGenerator;

import static game.baseball.ball.BallSetting.*;
import static game.baseball.player.PlayerSetting.*;

public enum GameSetting {

    GAME_SETTING(
            3,
            BALL_SETTING_VERSION_01,
            COMPUTER_PLAYER_SETTING_VERSION_01,
            HUMAN_PLAYER_SETTING_VERSION_01
    );

    private final int maxGameRound;
    private final BallSetting ballSetting;
    private final PlayerSetting humanPlayerSetting;
    private final PlayerSetting computerPlayerSetting;

    GameSetting(int maxGameRound, BallSetting ballSetting, PlayerSetting humanPlayerSetting, PlayerSetting computerPlayerSetting) {
        this.maxGameRound = maxGameRound;
        this.ballSetting = ballSetting;
        this.humanPlayerSetting = humanPlayerSetting;
        this.computerPlayerSetting = computerPlayerSetting;
    }

    public int getMaxGameRound() {
        return maxGameRound;
    }

    public int getBallSize() {
        return ballSetting.getBallSize();
    }

    public NumberGenerator getHumanPlayerNumberGenerator() {
        return humanPlayerSetting.getNumberGeneratorType();
    }

    public Player getHumanPlayer() {
        return humanPlayerSetting.getPlayer();
    }

    public NumberGenerator getComputerPlayerNumberGenerator() {
        return computerPlayerSetting.getNumberGeneratorType();
    }

    public Player getComputerPlayer() {
        return computerPlayerSetting.getPlayer();
    }
}
