package baseball.controller;

import baseball.models.Baseball;
import baseball.models.Computer;
import baseball.models.Player;
import baseball.views.InputView;
import baseball.views.OutputView;

public class Game {
    private Game() {}

    public static void runGame() {
        boolean isGameActive = true;
        while(isGameActive) {
            Computer computer = new Computer();
            Baseball baseball = new Baseball();
            while(baseball.isBaseBallEnd()) {
                String[] playerNumber = InputView.inputPlayerNumber();
                Player player = new Player(playerNumber);
                baseball.playBaseball(player.getBall(), computer.getBall());
                OutputView.printBaseballResult(baseball.getBallCount(), baseball.getStrikeCount());
            }
            isGameActive = InputView.inputRerunOrNot();
        }
    }


}
