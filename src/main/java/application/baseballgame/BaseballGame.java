package application.baseballgame;

public class BaseballGame {
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
