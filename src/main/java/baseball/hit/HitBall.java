package baseball.hit;

import baseball.Result;

public class HitBall implements Hit{
    @Override
    public void update(Result result) {
        result.increaseBalls();
    }
}
