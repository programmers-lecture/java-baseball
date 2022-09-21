package game.baesball.view.output;

public enum WinnerMessage {
    WINNER("승리하셨습니다 !!"),
    PLAY_GAME_AGAIN("다시 게임을 진행하시겠습니까 ?");

    private final String message;

    WinnerMessage(String message) {
        this.message = message;
    }
}
