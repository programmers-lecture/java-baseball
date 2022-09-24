package game.baseball.game;

import game.baseball.ball.Balls;
import game.baseball.hint.Hint;
import game.baseball.hint.Hints;

import static game.baseball.setting.GameSetting.*;

public class Referee {

    public Hints judge(Balls computerBalls, Balls humanBalls) {
        return Hint.getHints(computerBalls, humanBalls);
    }

    public void broadcast(Hints hints) {
        checkWinThenBroadcast(hints);
        checkLoseThenBroadcast(hints);
    }

    private void broadcastWin(Hints hints) {
        // TODO : 승리 출력
        System.out.println("승리");
    }

    private void broadcastLoseAndHint(Hints hints) {
        // TODO : 패배 출력
        System.out.println("패배");
       checkNothingThenBroadcast(hints);
        checkElseThenBroadcast(hints);
    }

    private void broadcastNothing(Hints hints) {
        System.out.println(hints.getNotingHint().getName());
        // TODO : 낫싱 출력
    }

    private void broadcastElseHint(Hints hints) {
        System.out.println(hints.getStrikeHint().getScore() + hints.getStrikeHint().getName() + " " +
                            hints.getBallHint().getScore() + hints.getBallHint().getName());
        // TODO : 스트라이크 볼 출력
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

    private void checkNothingThenBroadcast(Hints hints) {
        if (checkNothingHint(hints)) broadcastNothing(hints);
    }

    private boolean checkNothingHint(Hints hints) {
        return hints.getNotingHint().getScore() == 1;
    }

    private void checkElseThenBroadcast(Hints hints) {
        if (checkElseHint(hints)) broadcastElseHint(hints);
    }

    private boolean checkElseHint(Hints hints) {
        return hints.getStrikeHint().getScore() >= 1 || hints.getBallHint().getScore() >= 1;
    }
}
