package baseball.utils;

import java.util.Random;

public class RandomUtil {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final Random random = new Random();

    private RandomUtil() {}

    public static int createRandomNumber() {
        return random.nextInt(MAX_NUMBER) + MIN_NUMBER;
    }
}
