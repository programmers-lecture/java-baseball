package game.baesball.hint;

import game.baesball.view.input.InputView;
import game.baesball.view.output.OutputView;

import static game.baesball.view.output.OutputMessage.*;

public class HintChecker {

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
            strikeAndBallMessage(hint);
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
        new OutputView().sendMessage(String.valueOf(WINNER));
    }

    private void notingMessage() {
        new OutputView().sendMessage(NOTING.getMessage());
    }

    private void strikeAndBallMessage(Hint hint) {
        new OutputView().sendMessage(hint.getStrike() + STRIKE.getMessage() + " " + hint.getBall() + BALL.getMessage());
    }

    public boolean checkRestartGame() {
        new OutputView().sendMessage(PLAY_GAME_AGAIN.getMessage());
        String restart = new InputView().read();
         return checkRestartGame(restart);
    }

    private boolean checkRestartGame(String restart) {
        return restart.equals("1");
    }

}
