package baseball.utils;

import java.util.Random;

public class RandomUtil {
    private static final int NUMBER_MAX = 9;
    private static final Random random = new Random();

    private RandomUtil() {}

    public static int createRandomNumber() {
        return random.nextInt(NUMBER_MAX) + 1;
    }
}
