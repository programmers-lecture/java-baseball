package game.hit;

import game.Result;

public class HitStrike implements Hit{
    @Override
    public void update(Result result) {
        result.increaseStrikes();
    }
}
