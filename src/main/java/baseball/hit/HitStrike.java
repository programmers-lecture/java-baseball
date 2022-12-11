package baseball.hit;

import baseball.Result;

public class HitStrike implements Hit{
    @Override
    public void update(Result result) {
        result.increaseStrikes();
    }
}
