package game.baseball.hint;

import game.baseball.ball.Balls;

import java.util.Objects;
import java.util.stream.IntStream;

import static game.baseball.game.GameSetting.GAME_SETTING_VERSION_01;

public class HintHandler {

    public Hint createHint(Balls computerBalls, Balls playerBalls) {
        int strikeCount = countStrike(computerBalls, playerBalls);
        int ballCount = countBalls(computerBalls, playerBalls);
        return new Hint(strikeCount, ballCount - strikeCount);
    }

    private int countStrike(Balls computerBalls, Balls playerBalls) {
        return (int) IntStream
                .range(0, GAME_SETTING_VERSION_01.getBallSize())
                .peek(round -> Objects.equals(
                        computerBalls.getBalls().get(round),
                        playerBalls.getBalls().get(round)))
                .count();
    }

    private int countBalls(Balls computerBalls, Balls playerBalls) {
        int ball = 0;
        for (int computerRound = 0; computerRound < GAME_SETTING_VERSION_01.getBallSize(); computerRound++) {
            for (int playerRound = 0; playerRound < GAME_SETTING_VERSION_01.getBallSize(); playerRound++) {
                if (computerRound == playerRound) continue;
                if (Objects.equals(
                        computerBalls.getBalls().get(computerRound),
                        playerBalls.getBalls().get(playerRound))) ball++;
            }
        }
        return ball;
    }

}
