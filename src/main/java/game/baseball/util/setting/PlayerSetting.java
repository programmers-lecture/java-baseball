package game.baseball.util.setting;

import game.baseball.util.number.FixedNumberGenerator;
import game.baseball.util.number.NumberGenerator;
import game.baseball.util.number.RandomNumberGenerator;

import java.util.function.Supplier;

public enum PlayerSetting {

    COMPUTER_NUMBER_GENERATOR(RandomNumberGenerator::new),
    HUMAN_NUMBER_GENERATOR(FixedNumberGenerator::new);

    private final Supplier<NumberGenerator> numberGenerator;

    PlayerSetting(Supplier<NumberGenerator> numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public NumberGenerator createNumberGenerator() {
        return numberGenerator.get();
    }

}
