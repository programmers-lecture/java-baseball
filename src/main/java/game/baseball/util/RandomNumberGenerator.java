package game.baseball.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import static game.baseball.game.GameSetting.GAME_SETTING_VERSION_01;

public class RandomNumberGenerator implements NumberGenerator {

    private final Random random = new Random(System.currentTimeMillis());

    @Override
    public List<Integer> generate() {
        return Optional.of(getRandomNumbers(random))
                .orElseThrow(() -> new NumberFormatException("올바르지 않은 랜덤입니다.")); // TODO : Exception 관리
    }

    private List<Integer> getRandomNumbers(Random random) {
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < GAME_SETTING_VERSION_01.getBallSize()) {
            randomNumbers.add(getOverMinNumber(random));
        }
        return randomNumbers;
    }

    private int getOverMinNumber(Random random) {
        int number = random.nextInt(GAME_SETTING_VERSION_01.getMaxBallNumber()) + 1;
        if (number < GAME_SETTING_VERSION_01.getMinBallNumber()) {
            number = getOverMinNumber(random);
        }
        return number;
    }
}
