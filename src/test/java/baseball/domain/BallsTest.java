package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BallsTest {

    Balls balls = Balls.createBalls(Arrays.asList(1, 2, 3));
    Balls userBalls = Balls.createBalls(Arrays.asList(1, 3, 9));

    @Test
    @DisplayName("Balls 스트라이크 성공 테스트")
    void getStrikeTest() throws Exception {
        Assertions.assertTrue(balls.isStrike(userBalls, 0));
    }

    @Test
    @DisplayName("Balls 스트라이크 실패 테스트")
    void getNotStrikeTest() throws Exception {
        Assertions.assertFalse(balls.isStrike(userBalls, 1));
    }

    @Test
    @DisplayName("Balls 볼 성공 테스트")
    void getBallTest() throws Exception {
        Assertions.assertTrue(balls.isBall(userBalls, 1));
    }

    @Test
    @DisplayName("Balls 볼 실패 테스트")
    void getNotBallTest() throws Exception {
        Assertions.assertFalse(balls.isBall(userBalls, 2));
    }
}