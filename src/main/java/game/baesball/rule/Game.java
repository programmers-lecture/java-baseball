package game.baesball.rule;

import game.baesball.player.Player;

public class Game {

    public void playGame(Player computer, Player human) {
        GameHandler gameHandler = new GameHandler();
        HintHandler hintHandler = new HintHandler();

        computer.playGame();
        human.playGame();

        Hint hint = hintHandler.createHint(
                computer.getBalls(),
                human.getBalls()
        );

        System.out.println("hint.getStrike() = " + hint.getStrike());
        System.out.println("hint.getBall() = " + hint.getBall());

        boolean checkWin = gameHandler.checkWinResult(hint);

        if (!checkWin) playGame(computer, human);
    }
}
