package application.baseballgame.gameresult;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ThrowingResultTest {

    @DisplayName("투구 결과 반환")
    @Test
    void getResult() {
        List<Integer> computerNumbers = Arrays.asList(1, 2, 3);

        assertThat(ThrowingResult.getResult(computerNumbers, 0, 1))
                .isEqualTo(ThrowingResult.STRIKE);
        assertThat(ThrowingResult.getResult(computerNumbers, 1, 1))
                .isEqualTo(ThrowingResult.BALL);
        assertThat(ThrowingResult.getResult(computerNumbers, 2, 1))
                .isEqualTo(ThrowingResult.BALL);
        assertThat(ThrowingResult.getResult(computerNumbers, 2, 7))
                .isEqualTo(ThrowingResult.NOTHING);
    }
}