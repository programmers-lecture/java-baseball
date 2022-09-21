package game.baesball.rule;

import game.baesball.view.output.OutputView;
import game.baesball.view.output.WinnerMessage;

public class GameHandler {

    public boolean checkWinResult(Hint hint) {
        checkLose(hint);
        return checkWin(hint);
    }

    private boolean checkWin(Hint hint) {
        if (hint.getStrike() == 3) {
            winMessage();
            return true;
        }
        return false;
    }

    private boolean checkLose(Hint hint) {
        if (checkNoting(hint)) {
            notingMessage();
            return true;
        }

        if (checkStrikeAndBall(hint)) {
            strikeAndBallMessage();
            return true;
        }

        return false;
    }

    private boolean checkNoting(Hint hint) {
        return hint.getStrike() + hint.getBall() == 0;
    }

    private boolean checkStrikeAndBall(Hint hint) {
        return hint.getStrike() + hint.getBall() != 0;
    }

    private void winMessage() {
        new OutputView().sendMessage(String.valueOf(WinnerMessage.WINNER));

    }

    private void notingMessage() {
        new OutputView().sendMessage("");
    }

    private void loseMessage() {
        new OutputView().sendMessage("");
    }

    private void strikeAndBallMessage() {
        new OutputView().sendMessage("");
    }
}
