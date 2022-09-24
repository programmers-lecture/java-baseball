package game.baseball.view.input;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        return input.split("");
    }

    public static List<Integer> convertToIntegerList(String[] ballNumbers) {
        return Arrays.stream(ballNumbers)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
