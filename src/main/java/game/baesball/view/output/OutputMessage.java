package game.baesball.view.output;

public enum OutputMessage {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTING("낫싱"),
    WINNER("승리하셨습니다 !!"),
    PLAY_GAME_AGAIN("다시 게임을 진행하시겠습니까 ?");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
