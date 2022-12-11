package game.hit;

import game.Result;

public class HitBall implements Hit{
    @Override
    public void update(Result result) {
        result.increaseBalls();
    }
}
