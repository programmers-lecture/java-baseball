package game.baseball.setting;

import game.baseball.util.FixedNumberGenerator;
import game.baseball.util.NumberGenerator;
import game.baseball.util.RandomNumberGenerator;

public class PlayerSetting {

    private final NumberGenerator computerNumberGenerator = new RandomNumberGenerator();
    private final NumberGenerator humanNumberGenerator = new FixedNumberGenerator();

    public NumberGenerator getComputerNumberGenerator() {
        return computerNumberGenerator;
    }

    public NumberGenerator getHumanNumberGenerator() {
        return humanNumberGenerator;
    }
}
