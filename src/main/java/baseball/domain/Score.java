package baseball.domain;

import java.util.Arrays;
import java.util.HashMap;

public enum Score {

    STRIKE("스트라이크"), BALL("볼"), NOTHING("낫싱");

    private static final HashMap<Score, Integer> scoreMap = new HashMap<>();
    private static final int INIT_POINT = 0;
    private static final int INCREASE_POINT = 1;
    private final String value;

    static {
        pointReset();
    }

    private Score(String value) {
        this.value = value;
    }

    public static void increasePoint(Score judgement) {
        scoreMap.put(judgement, scoreMap.get(judgement) + INCREASE_POINT);
    }

    public static void pointReset() {
        Arrays.stream(values()).forEach(i -> scoreMap.put(i, INIT_POINT));
    }

    public String getValue() {
        return value;
    }

    public static int getPoint(Score score) {
        return scoreMap.get(score);
    }
}

