package game.baseball.player;

import game.baseball.util.FixedNumberGenerator;
import game.baseball.util.NumberGenerator;
import game.baseball.util.RandomNumberGenerator;

public enum PlayerSetting {
    HUMAN_PLAYER_SETTING_VERSION_01(new RandomNumberGenerator(), new HumanPlayer()),
    COMPUTER_PLAYER_SETTING_VERSION_01(new FixedNumberGenerator(), new ComputerPlayer());

    private final NumberGenerator numberGeneratorType;
    private Player player;

    PlayerSetting(NumberGenerator numberGeneratorType, Player player) {
        this.numberGeneratorType = numberGeneratorType;
        this.player = player;
    }

    public NumberGenerator getNumberGeneratorType() {
        return numberGeneratorType;
    }

    public Player getPlayer() {
        return player;
    }
}
