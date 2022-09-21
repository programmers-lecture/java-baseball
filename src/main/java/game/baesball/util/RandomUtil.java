package game.baesball.util;

import java.util.Random;

public class RandomUtil {

    public int[] makeThreeRandoms() {
        Random random = setRandom();
        return new int[]{
                getRandomNumberBetweenOnetoNine(random),
                getRandomNumberBetweenOnetoNine(random),
                getRandomNumberBetweenOnetoNine(random)
        };
    }

    private int getRandomNumberBetweenOnetoNine(Random random) {
        return random.nextInt(9) + 1;
    }

    private Random setRandom() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        return random;
    }
}
