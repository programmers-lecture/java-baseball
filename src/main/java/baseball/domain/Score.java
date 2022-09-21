package baseball.domain;

public enum Score {

    STRIKE(0), BALL(0);

    public static final int INIT_POINT = 0;
    private int point;

    Score(int score) {
        this.point = score;
    }

    public int getPoint() {
        return point;
    }

    public void increaseScore() {
        point++;
    }

    public static void initPoint() {
        for (Score score : Score.values()) {
            score.point = INIT_POINT;
        }
    }

    public static boolean isOutPoint() {
        if (STRIKE.point == Balls.BALL_SIZE) {
            return true;
        }
        return false;
    }

    public static String pointToString() {
        if (STRIKE.point == 0 && BALL.point == 0) {
            return "낫싱";
        }
        if (STRIKE.point != 0 && BALL.point == 0) {
            return STRIKE.point + " 스트라이크";
        }
        if (STRIKE.point == 0 && BALL.point != 0) {
            return BALL.point + "볼";
        }
        return STRIKE.point + "스트라이크 " + BALL.point + "볼";
    }
}

