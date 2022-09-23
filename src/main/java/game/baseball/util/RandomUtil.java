package game.baseball.util;

import java.util.Random;

public class RandomUtil {

    public int[] makeThreeRandoms() {
        Random random = setRandom();
        int[] randomNumbers = {
                getRandomNumberBetweenOnetoNine(random),
                getRandomNumberBetweenOnetoNine(random),
                getRandomNumberBetweenOnetoNine(random)
        };
        if (checkSameNumber(randomNumbers)) {
            randomNumbers = makeThreeRandoms();
        }
        return randomNumbers;
    }

    private int getRandomNumberBetweenOnetoNine(Random random) {
        return random.nextInt(9) + 1;
    }

    private Random setRandom() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        return random;
    }

    private boolean checkSameNumber(int[] numbers) {
        for (int curr = 0; curr < numbers.length - 1; curr++) {
            for (int next = curr + 1; next < numbers.length; next++) {
                if (numbers[curr] == numbers[next]) return true;
            }
        }
        return false;
    }
}
