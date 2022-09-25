package baseballgame.controller;

import baseballgame.model.RandomNumber;
import baseballgame.model.UserNumber;
import baseballgame.service.RandomNumberGenerator;
import baseballgame.service.Referee;
import baseballgame.view.InputView;
import baseballgame.view.OutputView;

import java.util.ArrayList;

public class BaseballGame {
    private final Referee referee = new Referee();

    public void run() {
        ArrayList<Integer> userNumber = new ArrayList<>();

        String gameResult = referee.judge(userNumber);
    }
}
