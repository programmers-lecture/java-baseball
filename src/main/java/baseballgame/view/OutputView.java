package baseballgame.view;

public class OutputView {
    private static final String GAME_OVER_MESSAGE = "n개의 숫자를 모두 맞히셨습니다. 게임 종료";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printGameOverMessage(Integer matchCount) {
        String gameOverMessage = GAME_OVER_MESSAGE.replace("n", String.valueOf(matchCount));
        System.out.println(gameOverMessage);
    }
}
