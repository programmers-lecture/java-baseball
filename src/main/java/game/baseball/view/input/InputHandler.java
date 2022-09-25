package game.baseball.view.input;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static game.baseball.message.ExceptionMessage.INPUT_FORMAT_ERROR;

public class InputHandler {

    private final static InputView inputView = new InputView();

    private InputHandler() {}

    public static String readLine() {
        String input = "";
        input = inputView.read();

        if (checkInputEmpty(input)) {
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

    private static boolean checkInputEmpty(String input) {
        return input.length() == 0;
    }
}
