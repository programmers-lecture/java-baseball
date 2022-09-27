package baseballgame.service;

import baseballgame.model.GameStatus;

import java.util.ArrayList;

public class Referee {
    public void judge(ArrayList<Integer> userNumber, ArrayList<Integer> randomNumber) {
        recordBallsAndStrikes(userNumber, randomNumber);
    }

    private void recordBallsAndStrikes(ArrayList<Integer> userNumber, ArrayList<Integer> randomNumber) {
        for (int i = 0; i < userNumber.size(); i++) {
            recordStrikes(userNumber, randomNumber, i);
        }
    }

    private void recordStrikes(ArrayList<Integer> userNumber, ArrayList<Integer> randomNumber, int i) {
        if (userNumber.get(i).equals(randomNumber.get(i))) {
            GameStatus.STRIKE.count();
        }

        for (int j = 0; j < userNumber.size(); j++) {
            recordBalls(userNumber, randomNumber, i, j);
        }
    }

    private void recordBalls(ArrayList<Integer> userNumber, ArrayList<Integer> randomNumber, int i, int j) {
        if (j == i) return;

        if (userNumber.get(j).equals(randomNumber.get(i))) {
            GameStatus.BALL.count();
        }
    }
}
