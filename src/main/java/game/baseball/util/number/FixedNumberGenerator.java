package game.baseball.util.number;

import java.util.List;
import java.util.Optional;

import static game.baseball.message.ExceptionMessage.INPUT_FORMAT_ERROR;
import static game.baseball.message.InputMessage.INPUT_PLAYER_BALLS;
import static game.baseball.view.input.InputHandler.*;
import static game.baseball.view.output.OutputView.printMessage;

public class FixedNumberGenerator implements NumberGenerator {

    @Override
    public List<Integer> generate() {
        return getFixedNumbers();
    }

    private List<Integer> getFixedNumbers() {
        printMessage(INPUT_PLAYER_BALLS.getMessage());
        return Optional.of(
                convertToIntegerList(splitEach(readLine())))
                .orElseThrow(
                        () -> new NumberFormatException(INPUT_FORMAT_ERROR.getErrorMessage()));
    }

}
