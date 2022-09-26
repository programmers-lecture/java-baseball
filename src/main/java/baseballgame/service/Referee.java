package baseballgame.service;

import baseballgame.model.GameStatus;

import java.util.ArrayList;

public class Referee {
    public void judge(ArrayList<Integer> userNumber, ArrayList<Integer> randomNumber) {
        checkBallAndStrike(userNumber, randomNumber);
    }

    private void checkBallAndStrike(ArrayList<Integer> userNumber, ArrayList<Integer> randomNumber) {
        for (int i = 0; i < userNumber.size(); i++) {
            if (userNumber.get(i).equals(randomNumber.get(i))) {
                GameStatus.STRIKE.count();
            }

            for (int j = 0; j < userNumber.size(); j++) {
                if (j == i) continue;

                if (userNumber.get(j).equals(randomNumber.get(i))) {
                    GameStatus.BALL.count();
                }
            }
        }
    }
}
