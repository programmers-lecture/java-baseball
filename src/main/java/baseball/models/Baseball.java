package baseball.models;

import java.util.List;
import java.util.stream.IntStream;

public class Baseball {
    private Integer strikeCount = 0;
    private Integer ballCount = 0;

    public void playBaseball(List<Integer> playerBall, List<Integer> computerBall) {
        countStrike(playerBall, computerBall);
        countBall(playerBall, computerBall);
    }

    public Integer getStrikeCount() {
        return strikeCount;
    }

    public Integer getBallCount() {
        return ballCount;
    }

    public boolean isBaseBallEnd() {
        return strikeCount < 3;
    }

    private void countStrike(List<Integer> playerBall, List<Integer> computerBall) {
        long strikeCount = IntStream.range(0, playerBall.size())
                .filter(idx -> playerBall.get(idx).equals(computerBall.get(idx)))
                .count();
        this.strikeCount = Long.valueOf(strikeCount).intValue();
    }

    private void countBall(List<Integer> playerBall, List<Integer> computerBall) {
        long totalCount = playerBall.stream()
                .filter(computerBall::contains)
                .count();
        this.ballCount = Long.valueOf(totalCount).intValue() - strikeCount;
    }
}
