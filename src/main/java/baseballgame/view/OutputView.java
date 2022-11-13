package baseballgame.view;

public class OutputView {
    private static final String GAME_OVER_MESSAGE = "n개의 숫자를 모두 맞히셨습니다. 게임 종료";
    private static final String CONFIRM_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String GAME_EXIT_MESSAGE = "게임이 종료되었습니다";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printGameOverMessage(Integer matchCount) {
        String gameOverMessage = GAME_OVER_MESSAGE.replace("n", String.valueOf(matchCount));
        System.out.println(gameOverMessage);
    }

    public void printConfirmMessage() {
        System.out.println(CONFIRM_MESSAGE);
    }

    public void printGameExitMessage() {
        System.out.println(GAME_EXIT_MESSAGE);
    }
}
