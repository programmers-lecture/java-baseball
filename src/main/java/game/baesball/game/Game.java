package game.baesball.game;

import game.baesball.hint.Hint;
import game.baesball.hint.HintHandler;
import game.baesball.player.Player;

public class Game {

    public void playGame(Player computer, Player human, boolean isRestart, int gameCount) {
        GameHandler gameHandler = new GameHandler();
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
