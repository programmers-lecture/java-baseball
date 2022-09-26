package baseball.models;

import baseball.enums.Score;

import java.util.List;
import java.util.stream.IntStream;

public class Baseball {
    public static final int BALL_SIZE = 3;

    private int totalCount = 0;
    private int strikeCount = 0;
    private int ballCount = 0;

    public void playBaseball(List<Integer> playerBall, List<Integer> computerBall) {
        countStrike(playerBall, computerBall);
        countBall(playerBall, computerBall);
    }

    public String getBaseballResult() {
        if(totalCount == 0)
            return Score.NOTHING.getScore(totalCount);
        String result = "";
        if(ballCount > 0)
            result += Score.BALL.getScore(ballCount) + " ";
        if(strikeCount > 0)
            result += Score.STRIKE.getScore(strikeCount);
        return result;
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
        this.totalCount = Math.toIntExact(playerBall.stream()
                .filter(computerBall::contains)
                .count());
        this.ballCount = totalCount - strikeCount;
    }
}
