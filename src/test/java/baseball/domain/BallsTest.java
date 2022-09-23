package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BallsTest {

    Balls balls = Balls.createBalls(Arrays.asList(1, 2, 3));
    Balls userBalls = Balls.createBalls(Arrays.asList(1, 3, 9));

    @Test
    @DisplayName("Balls 스트라이크 성공 테스트")
    void getStrikeTest() throws Exception {
        Assertions.assertTrue(balls.getStrike(userBalls, 0));
    }

    @Test
    @DisplayName("Balls 스트라이크 실패 테스트")
    void getNotStrikeTest() throws Exception {
        Assertions.assertTrue(balls.getStrike(userBalls, 1));
    }
}