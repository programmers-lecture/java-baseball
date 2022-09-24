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
        game.getComputerPlayer().playBall();

        while (untilMaxRound(game)) {
            game.getHumanPlayer().playBall();

            Hints judgement = getJudge(game);
            broadcastJudgeByReferee(game, getJudge(game));

            if (checkGameWin(judgement)) break;

            game.nextRound();
        }
        
        return askRestartGame();
    }

    private void broadcastJudgeByReferee(Game game, Hints judgement) {
        game.getReferee().broadcastGameResultMessage(judgement);
    }

    private Hints getJudge(Game game) {
        return game.getReferee().judge(
                game.getComputerPlayer().getBalls(),
                game.getHumanPlayer().getBalls());
    }

    private boolean untilMaxRound(Game game) {
        return game.getReferee().checkRound(game.getRound());
    }

    private boolean askRestartGame() {
        OutputView.printMessage(ASK_RESTART_GAME.getMessage());
        return parseInt(InputHandler.readLine()) == RESTART_GAME.getEndType();
    }

    private boolean checkGameWin(Hints judgement) {
        return judgement.getStrikeHint().getScore() == GAME_SETTING.getBallSize();
    }

}
