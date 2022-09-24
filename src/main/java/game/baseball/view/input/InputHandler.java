package game.baseball.view.input;

import game.baseball.message.ExceptionMessage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static game.baseball.message.ExceptionMessage.*;

public class InputHandler {

    private final static InputView inputView = new InputView();
    private final static InputValidation inputValidation = new InputValidation();

    public static String readLine() {
        String input = "";
        input = inputView.read();

        if (inputValidation.checkInputEmpty(input)) {
            input = inputView.read().trim();
        }

        return input;
    }

    public static String[] splitEach(String input) {
        return Optional.of(input.split(""))
                .orElseThrow(() -> new IllegalArgumentException(INPUT_FORMAT_ERROR.getErrorMessage()));
    }

    public static List<Integer> convertToIntegerList(String[] ballNumbers) {
        return Optional.of(Arrays.stream(ballNumbers)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()))
                .orElseThrow(() -> new IllegalArgumentException(INPUT_FORMAT_ERROR.getErrorMessage()));
    }
}
