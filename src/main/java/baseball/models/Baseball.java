package baseball.models;

import java.util.List;
import java.util.stream.IntStream;

public class Baseball {
    public static final int BALL_SIZE = 3;

    private int strikeCount = 0;
    private int ballCount = 0;

    public void playBaseball(List<Integer> playerBall, List<Integer> computerBall) {
        countStrike(playerBall, computerBall);
        countBall(playerBall, computerBall);
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public boolean isBaseBallEnd() {
        return strikeCount < BALL_SIZE;
    }

    private void countStrike(List<Integer> playerBall, List<Integer> computerBall) {
        this.strikeCount = Math.toIntExact(IntStream.range(0, playerBall.size())
                .filter(idx -> playerBall.get(idx).equals(computerBall.get(idx)))
                .count());
    }

    private void countBall(List<Integer> playerBall, List<Integer> computerBall) {
        int totalCount = Math.toIntExact(playerBall.stream()
                .filter(computerBall::contains)
                .count());
        this.ballCount = totalCount - strikeCount;
    }
}
