package baseball.utils;

import java.util.Random;

public class RandomUtil {
    private static final int NUMBER_MAX = 9;

    private RandomUtil() {}

    public static int createRandomNumber() {
        Random random = new Random();
        return random.nextInt(NUMBER_MAX) + 1;
    }
}
