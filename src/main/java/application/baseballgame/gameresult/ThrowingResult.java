package application.baseballgame.gameresult;

import java.util.List;

public enum ThrowingResult {
    BALL, STRIKE, NOTHING;

    public static ThrowingResult getResult(List<Integer> computerNumbers, int index, int userNumber) {
        if (computerNumbers.get(index) == userNumber) {
            return STRIKE;
        }
        if (computerNumbers.contains(userNumber)) {
            return BALL;
        }
        return NOTHING;
    }
}
