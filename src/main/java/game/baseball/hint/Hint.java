package game.baseball.hint;

import game.baseball.ball.Balls;

import java.util.*;
import java.util.stream.IntStream;

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
        if (STRIKE.score == 0 && BALL.score == 0) NOTHING.score = 1;
    }

    private static int getStrikeCount(Balls computerBalls, Balls humanBalls) {
        return (int) IntStream
                .range(0, GAME_SETTING.getBallSize())
                .filter(round -> checkStrike(computerBalls, humanBalls, round))
                .count();
    }

    private static boolean checkStrike(Balls computerBalls, Balls humanBalls, int round) {
        return Objects.equals(computerBalls.getBalls().get(round), humanBalls.getBalls().get(round));
    }

    private static int getBallCount(Balls computerBalls, Balls humanBalls) {
        Set<Integer> totalBalls = new HashSet<>();
        totalBalls.addAll(computerBalls.getBalls());
        totalBalls.addAll(humanBalls.getBalls());
        return totalBalls.size() - getStrikeCount(computerBalls, humanBalls);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
