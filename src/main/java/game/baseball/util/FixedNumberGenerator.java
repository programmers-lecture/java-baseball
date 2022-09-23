package game.baseball.util;

import java.util.List;
import java.util.Optional;

import static game.baseball.game.GameSetting.GAME_SETTING_VERSION_01;
import static game.baseball.view.input.InputHandler.*;

public class FixedNumberGenerator implements NumberGenerator {

    @Override
    public List<Integer> generate() {
        return Optional
                .ofNullable(getFixedNumbers())
                .orElseThrow(() -> new NumberFormatException("올바르지 않은 포맷입니다.")); // TODO : Exception 관리
    }

    private List<Integer> getFixedNumbers() {
        List<Integer> fixedNumbers = convertToIntegerList(splitBySpace(readLine()));
        if (!checkNumberSize(fixedNumbers)) {
            fixedNumbers = getFixedNumbers();
        }
        return fixedNumbers;
    }

    private boolean checkNumberSize(List<Integer> fixedNumbers) {
        if (fixedNumbers.size() == GAME_SETTING_VERSION_01.getBallSize()) return true;
        return false;
    }

}
