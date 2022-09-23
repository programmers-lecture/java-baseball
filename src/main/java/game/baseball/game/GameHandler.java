package game.baseball.game;

import game.baseball.hint.Hint;
import game.baseball.hint.HintChecker;
import game.baseball.hint.HintHandler;
import game.baseball.player.Player;

public class GameHandler {

    public void playGame(Player computer, Player human, boolean isRestart, int gameCount) {
        HintChecker gameHandler = new HintChecker();
        HintHandler hintHandler = new HintHandler();

        if (isRestart || gameCount == 0) computer.playGame();
        human.playGame();

        Hint hint = hintHandler.createHint(
                computer.getBalls(),
                human.getBalls()
        );

        boolean checkWin = gameHandler.checkWinResult(hint);
        if (!checkWin || gameHandler.checkRestartGame()) this.playGame(computer, human, checkWin, gameCount + 1);
    }
}
