package baseball.domain;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class Scores {
    private static final int INIT_POINT = 0;
    private static final int INCREASE_POINT = 1;
    private final Map<Score, Integer> scores = new EnumMap<>(Score.class);


    public void pointReset() {
        Arrays.stream(Score.values()).forEach(i -> scores.put(i, INIT_POINT));
    }

    public void increasePoint(Score judgement) {
        scores.put(judgement, scores.get(judgement) + INCREASE_POINT);
    }

    public int getPoint(Score score) {
        return scores.get(score);
    }

    public String getValue(Score score) {
        return score.getValue();
    }

}
