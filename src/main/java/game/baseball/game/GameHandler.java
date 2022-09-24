package game.baseball.game;

public class GameHandler {

    public void playGame(Game game) {

        game.getComputerPlayer().playBall();
        game.getHumanPlayer().playBall();

        Hints judgement =
                game.getReferee()
                        .judge(
                                game.getComputerPlayer().getBalls(),
                                game.getHumanPlayer().getBalls()
                        );

        game.getReferee().broadcast(judgement);
        game.getReferee().checkRound();

//
//        HintChecker gameHandler = new HintChecker();
//        HintHandler hintHandler = new HintHandler();
//
//        if (isRestart || gameCount == 0) computer.playGame();
//        human.playGame();
//
//        Hints hint = hintHandler.createHint(
//                computer.getBalls(),
//                human.getBalls()
//        );
//
//        boolean checkWin = gameHandler.checkWinResult(hint);
//        if (!checkWin || gameHandler.checkRestartGame()) this.playGame(computer, human, checkWin, gameCount + 1);
    }
}
