package game.baseball.game;

import game.baseball.ball.Balls;
import game.baseball.hint.Hint;
import game.baseball.hint.Hints;
import game.baseball.view.input.InputHandler;
import game.baseball.view.output.OutputView;

import static game.baseball.message.GameResultMessage.*;
import static game.baseball.message.InputMessage.ASK_RESTART_GAME;
import static game.baseball.util.setting.GameEndSetting.RESTART_GAME;
import static game.baseball.util.setting.GameSetting.GAME_SETTING;
import static game.baseball.view.output.OutputView.printMessage;
import static java.lang.Integer.parseInt;

public class Referee {

    public Hints judge(Balls computerBalls, Balls humanBalls) {
        return Hint.getHints(computerBalls, humanBalls);
    }

    public void broadcastGameResultMessage(Hints hints) {
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

    public void nextRound(Round round) {
        round.nextRound();
    }

    public boolean checkWin(Hints hints) {
        return hints.getStrikeHint().getScore() == GAME_SETTING.getBallSize();
    }

    public boolean checkRoundEnd(Round round) {
        return round.getRound() >= GAME_SETTING.getMaxGameRound();
    }

    public boolean askRestartGame() {
        OutputView.printMessage(ASK_RESTART_GAME.getMessage());
        return parseInt(InputHandler.readLine()) == RESTART_GAME.getEndType();
    }
}
