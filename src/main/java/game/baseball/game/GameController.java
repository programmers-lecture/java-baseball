package game.baseball.game;

import game.baseball.hint.Hints;
import game.baseball.player.ComputerPlayer;
import game.baseball.player.HumanPlayer;

public class GameController {

    public boolean playGameAndGetEndType(ComputerPlayer computerPlayer,
                                         HumanPlayer humanPlayer,
                                         Referee referee,
                                         Round round) {

        computerPlayer.playBall();
        while (!referee.checkRoundEnd(round)) {
            humanPlayer.playBall();

            Hints judgement = referee.judge(
                    computerPlayer.getBalls(),
                    humanPlayer.getBalls());

            referee.broadcastGameResultMessage(judgement);

            if (referee.checkWin(judgement)) break;

            referee.nextRound(round);
        }

        return referee.askRestartGame();
    }

}
