package game.baseball.hint;

import game.baseball.ball.Balls;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static game.baseball.util.setting.GameSetting.GAME_SETTING;


public enum Hint {
    STRIKE("스트라이크", 0),
    BALL("볼", 0),
    NOTHING("낫싱", 0);

    private final String name;
    private int score;

    Hint(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static Hints getHints(Balls computerBalls, Balls humanBalls) {
        setEachScores(computerBalls, humanBalls);
        return new Hints(createHints());
    }

    private static void initializeScoresToZero() {
        Arrays.stream(Hint.values()).forEach(hint -> hint.score = 0);
    }

    private static Map<String, Hint> createHints() {
        Map<String, Hint> hints = new HashMap<>();
        Arrays.stream(Hint.values())
                .forEach(hint -> hints.put(hint.name, hint));
        return hints;
    }

    private static void setEachScores(Balls computerBalls, Balls humanBalls) {
        initializeScoresToZero();
        STRIKE.score = getStrikeCount(computerBalls, humanBalls);
        BALL.score = getBallCount(computerBalls, humanBalls);
        if (checkNothing()) NOTHING.score = 1;
    }

    private static boolean checkNothing() {
        return STRIKE.score == 0 && BALL.score == 0;
    }

    private static int getStrikeCount(Balls computerBalls, Balls humanBalls) {
        int strike = 0;
        for (int round = 0; round < GAME_SETTING.getBallSize(); round++) {
            if (checkStrike(computerBalls, humanBalls, round)) strike++;
        }
        return strike;
    }

    private static boolean checkStrike(Balls computerBalls, Balls humanBalls, int round) {
        return Objects.equals(computerBalls.getBalls().get(round), humanBalls.getBalls().get(round));
    }

    private static int getBallCount(Balls computerBalls, Balls humanBalls) {
        int ball = 0;
        for (int round = 0; round < GAME_SETTING.getBallSize(); round++) {
            if (checkBallMatchAny(computerBalls, humanBalls, round) &&
                !checkStrike(computerBalls, humanBalls, round))
                ball++;
        }
        return ball;
    }

    private static boolean checkBallMatchAny(Balls computerBalls, Balls humanBalls, int round) {
        return computerBalls
                .getBalls()
                .contains(humanBalls.getBalls().get(round));
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
