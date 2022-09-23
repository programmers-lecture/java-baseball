package game.baseball.player;

import game.baseball.util.FixedNumberGenerator;
import game.baseball.util.NumberGenerator;
import game.baseball.util.RandomNumberGenerator;

public enum PlayerSetting {
    HUMAN_PLAYER(new RandomNumberGenerator()),
    COMPUTER_PLAYER(new FixedNumberGenerator());

    private final NumberGenerator numberGeneratorType;

    PlayerSetting(NumberGenerator numberGeneratorType) {
        this.numberGeneratorType = numberGeneratorType;
    }
}
