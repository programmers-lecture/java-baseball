package game.baseball.game;

import game.baseball.hint.Hints;
import game.baseball.view.input.InputHandler;
import game.baseball.view.output.OutputView;

import static game.baseball.message.InputMessage.ASK_RESTART_GAME;
import static game.baseball.util.setting.GameEndSetting.RESTART_GAME;
import static game.baseball.util.setting.GameSetting.GAME_SETTING;
import static java.lang.Integer.parseInt;

public class GameHandler {

    public boolean playGameAndGetEndType(Game game) {
        boolean checkRestart = false;
        boolean checkEnd = false;

        game.getComputerPlayer().playBall();

        while (!checkEnd) {
            game.getHumanPlayer().playBall();

            Hints judgement =
                    game.getReferee().judge(
                            game.getComputerPlayer().getBalls(),
                            game.getHumanPlayer().getBalls());

            game.getReferee().broadcast(judgement);

            if (checkGameWin(judgement)) {
                checkRestart = askRestartGame();
                checkEnd = true;
            }
        }
        return checkRestart;
    }

    private boolean askRestartGame() {
        OutputView.printMessage(ASK_RESTART_GAME.getMessage());
        return parseInt(InputHandler.readLine()) == RESTART_GAME.getEndType();
    }

    private boolean checkGameWin(Hints judgement) {
        return judgement.getStrikeHint().getScore() == GAME_SETTING.getBallSize();
    }

}
