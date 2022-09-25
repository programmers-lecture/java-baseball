package game.baseball.view.input;

import game.baseball.view.output.OutputView;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static game.baseball.message.ExceptionMessage.INPUT_FORMAT_ERROR;
import static game.baseball.util.setting.GameSetting.GAME_SETTING;

public class InputHandler {

    private final static InputView inputView = new InputView();

    private InputHandler() {
    }

    public static String readLine() {
        String input = "";
        input = inputView.read();

        if (!checkDigit(input) || checkInputEmpty(input)) {
            OutputView.printMessage(INPUT_FORMAT_ERROR.getErrorMessage());
            input = InputHandler.readLine();
        }

        return input;
    }

    public static String[] splitEach(String inputBall) {
        return Optional.of(inputBall.split(""))
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

    private static boolean checkDigit(String inputBall) {
        return Pattern
                .compile("^[1-9]{" + GAME_SETTING.getBallSize() + "}$")
                .matcher(inputBall)
                .find();
    }
}
