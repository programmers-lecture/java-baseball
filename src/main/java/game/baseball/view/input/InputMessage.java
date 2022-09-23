package game.baseball.view.input;

public enum InputMessage {

    INPUT_PLAYER_BALLS("플레이어의 야구 숫자 3개를 입력해주세요. ex) 1 2 3");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
