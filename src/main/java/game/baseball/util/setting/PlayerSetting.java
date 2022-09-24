package game.baseball.util.setting;

import game.baseball.util.number.FixedNumberGenerator;
import game.baseball.util.number.NumberGenerator;
import game.baseball.util.number.RandomNumberGenerator;

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
