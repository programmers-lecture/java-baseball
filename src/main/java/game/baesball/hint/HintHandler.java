package game.baesball.hint;

import game.baesball.ball.Balls;

import java.util.Objects;

public class HintHandler {

    public Hint createHint(Balls computerBalls, Balls playerBalls) {
        int strikeCount = countStrike(computerBalls, playerBalls);
        int ballCount = countBalls(computerBalls, playerBalls);
        return new Hint(strikeCount, ballCount - strikeCount);
    }

    private int countStrike(Balls computerBalls, Balls playerBalls) {
        int strike = 0;
        if (Objects.equals(computerBalls.getBallOne(), playerBalls.getBallOne())) strike++;
        if (Objects.equals(computerBalls.getBallTwo(), playerBalls.getBallTwo())) strike++;
        if (Objects.equals(computerBalls.getBallThree(), playerBalls.getBallThree())) strike++;
        return strike;
    }

    private int countBalls(Balls computerBalls, Balls playerBalls) {
        int ball = 0;
        int[] compBalls = computerBalls.getBalls();
        int[] playBalls = playerBalls.getBalls();
        for (int com = 0; com < 3; com++) {
            for (int play = 0; play < 3; play++) {
                if (Objects.equals(compBalls[com], playBalls[play])) ball++;
            }
        }
        return ball;
    }

}
