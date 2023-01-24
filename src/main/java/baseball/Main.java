package baseball;

public class Main {
    private static BaseballGame baseballGame;

    public static void main(String[] args) {
        String gameStatus = Constant.CONTINUE;
        while (gameStatus.equals(Constant.CONTINUE)) {
            baseballGame = new BaseballGame();
            gameStatus = baseballGame.play();
        }
    }
}