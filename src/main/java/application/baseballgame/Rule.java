package application.baseballgame;

public enum Rule {
    NUMBER_COUNT(3);

    private final int value;

    Rule(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
