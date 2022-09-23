package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.assertj.core.api.Assertions.assertThat;


class BallTest {


    @Test
    @DisplayName("Ball 생성자 유효성 검사 예외 테스트")
         void ballValidation() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Ball(10));
    }

    @Test
    @DisplayName("Ball 생성자 성공 테스트")
    void successBall() throws Exception {
        Assertions.assertDoesNotThrow(() -> new Ball(3));
    }

    @Test
    @DisplayName("Ball Equals 테스트 ")
    void BallEquals() throws Exception {
        Ball ball = new Ball(1);
        assertThat(ball).isEqualTo(new Ball(1));
    }

    @Test
    @DisplayName("Ball Equals 테스트")
    void BallNotEquals() throws Exception {
        Ball ball = new Ball(1);
        assertThat(ball).isNotEqualTo(new Ball(2));
    }
}