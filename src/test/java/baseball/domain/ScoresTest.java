package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoresTest {

    @Test
    @DisplayName("스코아 점수 리셋")
    void pointResetTest() throws Exception {
        //given
        Scores scores = new Scores();
        //when
        scores.pointReset();
        //then
        assertAll(
                () -> Assertions.assertThat(scores.getPoint(Score.STRIKE)).isEqualTo(0),
                () ->  Assertions.assertThat(scores.getPoint(Score.BALL)).isEqualTo(0)
        );
    }

}