package game.baseball.hint;

import java.util.Map;

import static game.baseball.hint.Hint.*;

public class Hints {

    private final Map<String, Hint> hints;

    public Hints(Map<String, Hint> hints) {
        this.hints = hints;
    }

    public Hint getStrikeHint() {
        return hints.get(STRIKE.getName());
    }

    public Hint getBallHint() {
        return hints.get(BALL.getName());
    }

    public Hint getNotingHint() {
        return hints.get(NOTHING.getName());
    }
}
