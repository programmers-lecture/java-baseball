package game.baseball.message;

public enum InputMessage {

    INPUT_PLAYER_BALLS("숫자를 입력해주세요. : ");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

}
