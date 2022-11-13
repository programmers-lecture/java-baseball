package game.baseball.ball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static game.baseball.message.ExceptionMessage.INCORRECT_BALL_SIZE;
import static game.baseball.util.setting.BallSetting.BALL_LEAST_SIZE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BallsTest {

    @Test
    @DisplayName("볼 개수 맞지 않을 경우 예외 처리 테스트")
    void ballSizeTest() {
        List<Integer> notEnoughBalls =
                IntStream.range(0, BALL_LEAST_SIZE.getBallSetting() - 1)
                        .boxed()
                        .collect(Collectors.toList());

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Balls(notEnoughBalls)
        );

        assertEquals(INCORRECT_BALL_SIZE.getErrorMessage(), exception.getMessage());
    }

}