package application.baseballgame.player;

public enum UserChoice {
    AGAIN(1), STOP(2);

    private final int value;

    UserChoice(int value) {
        this.value = value;
    }

    public static boolean isStop(int userChoice) {
        return UserChoice.STOP.value == userChoice;
    }

    public static boolean contains(int choice) {
        return UserChoice.AGAIN.value == choice || UserChoice.STOP.value == choice;
    }
}
