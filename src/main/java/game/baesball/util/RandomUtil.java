package game.baesball.util;

import java.util.Random;

public class RandomUtil {

    public Integer[] makeThreeRandoms() {
        Random random = setRandom();
        return new Integer[] {
                getRandomNumberBetweenOnetoNine(random),
                getRandomNumberBetweenOnetoNine(random),
                getRandomNumberBetweenOnetoNine(random)
        };
    }

    private int getRandomNumberBetweenOnetoNine(Random random) {
        random.setSeed(9);
        return random.nextInt() + 1;
    }

    private Random setRandom() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        return random;
    }
}
