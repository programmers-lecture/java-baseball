package application.baseballGame;

public class BaseballGame {
    static final int NUMBER_COUNT_RULE = 3;

    public void run() {
        Player computer = new Computer();
        computer.setNumbers();
        Player user = new User();
        GameResult gameResult = new GameResult();
        while(!gameResult.isWin()) {
            user.setNumbers();
            gameResult.setResult(computer, user);
            gameResult.printResult();
        }
    }
}
