package game.baseball.view.input;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

import static game.baseball.message.ExceptionMessage.INPUT_FORMAT_ERROR;
import static game.baseball.util.setting.BallSetting.BALL_LEAST_SIZE;
import static java.util.stream.Collectors.toList;

public class InputHandler {

    private final static InputView inputView = new InputView();

    private InputHandler() {
    }

    public static String readLine() {
        return Optional
                .ofNullable(inputView.read())
                .orElseThrow(() ->
                        new NullPointerException(INPUT_FORMAT_ERROR.getErrorMessage()));
    }

    public static String[] splitEach(String inputBall) {
        if (inputBall.length() == 0) {
            throw new IllegalArgumentException(INPUT_FORMAT_ERROR.getErrorMessage());
        }
        return inputBall.split("");
    }

    public static List<Integer> convertToIntegerList(String[] inputBalls) {
        List<Integer> balls = Arrays
                .stream(inputBalls)
                .filter(InputHandler::checkOneDigit)
                .map(Integer::parseInt)
                .collect(toList());
        if (balls.size() != BALL_LEAST_SIZE.getBallSetting()) {
            throw new IllegalArgumentException(INPUT_FORMAT_ERROR.getErrorMessage());
        }
        return balls;
    }

    private static boolean checkOneDigit(String ball) {
        return Pattern.compile("^[1-9]$").matcher(ball).matches();
    }

}
