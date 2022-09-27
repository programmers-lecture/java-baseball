package game.baseball.view.input;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static game.baseball.message.ExceptionMessage.INPUT_FORMAT_ERROR;
import static game.baseball.util.setting.BallSetting.BALL_LEAST_SIZE;

public class InputHandler {

    private final static InputView inputView = new InputView();

    private InputHandler() {
    }

    public static String readLine() {
        String input = "";
        input = inputView.read();

        return input;
    }

    public static String[] splitEach(String inputBall) {
        String[] balls = inputBall.split("");
        if (!checkSplitFormWithMaxBallSizeAndOnlyDigit(balls)) {
            throw new IllegalArgumentException(INPUT_FORMAT_ERROR.getErrorMessage());
        }
        return balls;
    }

    private static boolean checkSplitFormWithMaxBallSizeAndOnlyDigit(String[] balls) {
        return Arrays.stream(balls)
                .filter(InputHandler::checkOneDigit)
                .count() ==
                BALL_LEAST_SIZE.getBallSetting();
    }

    public static List<Integer> convertToIntegerList(String[] ballNumbers) {
        return Optional.of(Arrays.stream(ballNumbers)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()))
                .orElseThrow(() -> new IllegalArgumentException(INPUT_FORMAT_ERROR.getErrorMessage()));
    }

    public static boolean checkOneDigit(String inputBall) {
        return Pattern
                .compile("^[1-9]+$")
                .matcher(inputBall)
                .find();
    }
}
