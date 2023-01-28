package application.numbergenerator;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int RANDOM_NUMBER_UPPER_BOUND = 9;
    private static final int ONE = 1;

    @Override
    public int generate() {
        Random random = new Random();
        return random.nextInt(RANDOM_NUMBER_UPPER_BOUND) + ONE;
    }
}
