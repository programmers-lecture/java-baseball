package baseball.enums;

public enum Score {
    STRIKE("스트라이크"), BALL("볼"), NOTHING("낫싱");

    private final String name;

    Score(String name) {
        this.name = name;
    }

    public String getScore(int count) {
        if(count > 0)
            return count + name;
        return name;
    }
}
