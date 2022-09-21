package baseball.domain;

public enum Score {

    STRIKE(0), BALL(0);

    public static final int INIT_POINT = 0;
    public static final String STRIKE_MSG = " 스트라이크";
    public static final String BALL_MSG = " 볼";
    public static final String NOTHING_MSG = "낫싱";
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
            return NOTHING_MSG;
        }
        if (STRIKE.point != 0 && BALL.point == 0) {
            return STRIKE.point + STRIKE_MSG;
        }
        if (STRIKE.point == 0 && BALL.point != 0) {
            return BALL.point + BALL_MSG;
        }
        return STRIKE.point + STRIKE_MSG + BALL.point + BALL_MSG;
    }
}

