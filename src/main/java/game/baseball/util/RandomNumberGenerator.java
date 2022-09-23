package game.baseball.util;

import java.util.Optional;
import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {

    private final Random random = new Random(System.currentTimeMillis());

    @Override
    public int generate(int numberSize, int minNumber, int maxNumber) {
        return Optional.of(getNumberBetweenMinAndMax(minNumber, maxNumber, random))
                .orElseThrow(() -> new NumberFormatException("올바르지 않은 랜덤입니다.")); // TODO : Exception 관리
    }

    private int getNumberBetweenMinAndMax(int minNumber, int maxNumber, Random random) {
        int number = random.nextInt(maxNumber) + 1;
        if (number < minNumber) {
            number = getNumberBetweenMinAndMax(minNumber, maxNumber, random);
        }
        return number;
    }

}
