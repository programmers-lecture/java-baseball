package game.baseball.game;

import game.baseball.ball.Balls;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.IntStream;

import static game.baseball.util.setting.BallSetting.BALL_LEAST_SIZE;
import static game.baseball.util.setting.GameEndSetting.END_GAME;
import static game.baseball.util.setting.GameEndSetting.RESTART_GAME;
import static game.baseball.util.setting.GameSetting.GAME_SETTING;
import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RefereeTest {

    private final Referee referee = new Referee();

    @Test
    @DisplayName("승리할 경우 심판 판단 테스트")
    void whenPlayerWinRefereeBroadcastsTest() {
        List<Integer> balls = IntStream
                .range(0, BALL_LEAST_SIZE.getBallSetting())
                .boxed()
                .collect(toList());

        boolean checkWin =
                referee.checkWin(
                        referee.judge(
                                new Balls(balls),
                                new Balls(balls)));

        assertTrue(checkWin);
    }

    @Test
    @DisplayName("총 라운드 종료 시 심판 종료 판단 테스트")
    void whenRefereeCheckRoundEndTest() {
        Round round = new Round();
        for (int currRound = 0; currRound < GAME_SETTING.getMaxGameRound(); currRound++) {
            referee.nextRound(round);
        }

        assertTrue(referee.checkRoundEnd(round));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    @DisplayName("총 라운드 종료 시 심판 게임 재시작 판단 테스트")
    void whenRoundEndAndRefereeCheckRestartTest(String restartAnsweredValue) {
        Round round = new Round();
        for (int currRound = 0; currRound < GAME_SETTING.getMaxGameRound(); currRound++) {
            referee.nextRound(round);
        }

        System.setIn(new ByteArrayInputStream(restartAnsweredValue.getBytes(StandardCharsets.UTF_8)));

        assertEquals(
                parseInt(restartAnsweredValue) == RESTART_GAME.getEndType() ?
                        RESTART_GAME.getEndType() : END_GAME.getEndType(),
                parseInt(restartAnsweredValue)
        );
    }

}
