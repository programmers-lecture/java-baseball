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

}
