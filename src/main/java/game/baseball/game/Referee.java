package game.baseball.game;

import game.baseball.ball.Balls;
import game.baseball.hint.Hint;
import game.baseball.hint.Hints;

import static game.baseball.message.GameResultMessage.*;
import static game.baseball.util.setting.GameSetting.GAME_SETTING;
import static game.baseball.view.output.OutputView.printMessage;

public class Referee {

    public Hints judge(Balls computerBalls, Balls humanBalls) {
        return Hint.getHints(computerBalls, humanBalls);
    }

    public void broadcast(Hints hints) {
        checkWinThenBroadcast(hints);
        checkLoseThenBroadcast(hints);
    }

    private void broadcastWin(Hints hints) {
        printMessage(getHintMessage(WIN, hints));
    }

    private void broadcastLoseAndHint(Hints hints) {
        printMessage(getHintMessage(LOSE, hints));
    }

    private void checkWinThenBroadcast(Hints hints) {
         if (checkWin(hints)) broadcastWin(hints);
    }

    private void checkLoseThenBroadcast(Hints hints) {
        if (!checkWin(hints)) broadcastLoseAndHint(hints);
    }

    private boolean checkWin(Hints hints) {
        return hints.getStrikeHint().getScore() == GAME_SETTING.getBallSize();
    }

}
