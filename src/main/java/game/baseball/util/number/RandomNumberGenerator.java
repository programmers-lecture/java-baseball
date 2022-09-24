package game.baseball.util.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import static game.baseball.util.setting.GameSetting.GAME_SETTING;

public class RandomNumberGenerator implements NumberGenerator {

    private final Random random = new Random(System.currentTimeMillis());

    @Override
    public List<Integer> generate() {
        return Optional.of(getRandomNumbers(random))
                .orElseThrow(() -> new NumberFormatException("올바르지 않은 랜덤입니다.")); // TODO : Exception 관리
    }

    private List<Integer> getRandomNumbers(Random random) {
        List<Integer> randomNumbers = new ArrayList<>();
        while (checkSizeUntilMaxBallSize(randomNumbers)) {
            randomNumbers.add(
                    Optional.ofNullable(
                                    getRandomNumberWithCondition(random, randomNumbers))
                            .orElseThrow(() -> new NumberFormatException("올바르지 않은 랜덤입니다.")));
        }
        return randomNumbers;
    }

    private Integer getRandomNumberWithCondition(Random random, List<Integer> randomNumbers) {
        int selectedNumber = getRandomNumberLessThanMax(random);
        if (checkLessThanMin(selectedNumber) ||
                checkAlreadyExists(randomNumbers, selectedNumber)) {
            return null;
        }
        return selectedNumber;
    }

    private boolean checkSizeUntilMaxBallSize(List<Integer> randomNumbers) {
        return randomNumbers.size() < GAME_SETTING.getBallSize();
    }

    private int getRandomNumberLessThanMax(Random random) {
        return random.nextInt(GAME_SETTING.getMaxBallNumber()) + 1;
    }

    private boolean checkAlreadyExists(List<Integer> randomNumbers, int selectedNumber) {
        return randomNumbers.contains(selectedNumber);
    }

    private boolean checkLessThanMin(int selectedNumber) {
        return GAME_SETTING.getMinBallNumber() > selectedNumber;
    }
}
