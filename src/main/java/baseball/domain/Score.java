package baseball.domain;

public enum Score {

    STRIKE("스트라이크"), BALL("볼"), NOTHING("낫싱");
    private final String value;

    private Score(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

