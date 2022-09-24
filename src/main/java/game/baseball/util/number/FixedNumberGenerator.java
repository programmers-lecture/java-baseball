package game.baseball.util.number;

import java.util.List;
import java.util.Optional;

import static game.baseball.message.InputMessage.INPUT_PLAYER_BALLS;
import static game.baseball.view.output.OutputView.*;
import static game.baseball.util.setting.GameSetting.GAME_SETTING;
import static game.baseball.view.input.InputHandler.*;

public class FixedNumberGenerator implements NumberGenerator {

    @Override
    public List<Integer> generate() {
        return Optional
                .ofNullable(getFixedNumbers())
                .orElseThrow(() -> new NumberFormatException("올바르지 않은 포맷입니다.")); // TODO : Exception 관리
    }

    private List<Integer> getFixedNumbers() {
        printMessage(INPUT_PLAYER_BALLS.name());
        List<Integer> fixedNumbers = convertToIntegerList(splitEach(readLine()));
        if (!checkNumberSize(fixedNumbers)) {
            fixedNumbers = getFixedNumbers();
        }
        return fixedNumbers;
    }

    private boolean checkNumberSize(List<Integer> fixedNumbers) {
        return fixedNumbers.size() == GAME_SETTING.getBallSize();
    }

}
