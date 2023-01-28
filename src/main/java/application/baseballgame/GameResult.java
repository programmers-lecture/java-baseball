package application.baseballgame;

import java.util.List;

public class GameResult {
    private static final int MAX = Rule.NUMBER_COUNT.value();
    private int ball;
    private int strike;

    public void printResult() {
        if(ball == 0 && strike == 0) {
            System.out.println("낫싱");
            return;
        }
        if(strike == 0) {
            System.out.println(ball + "볼");
            return;
        }
        if(ball == 0) {
            if(strike == Rule.NUMBER_COUNT.value()) {
                System.out.println(strike + "스트라이크");
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                return;
            }
            System.out.println(strike + "스트라이크");
            return;
        }
        System.out.println(ball + "볼 " + strike + "스트라이크");
    }

    public boolean isWin() {
        return strike == MAX;
    }

    public void setResult(Player computer, Player user) {
        setBall(computer.getNumbers(), user.getNumbers());
        setStrike(computer.getNumbers(), user.getNumbers());
    }

    private void setBall(List<Integer> computerNumbers, List<Integer> userNumbers) {
        ball = 0;
        for(int i = 0; i < Rule.NUMBER_COUNT.value(); i++) {
            if(computerNumbers.contains(userNumbers.get(i)) && computerNumbers.get(i) != userNumbers.get(i)) {
                ball++;
            }
        }
    }

    private void setStrike(List<Integer> computerNumbers, List<Integer> userNumbers) {
        strike = 0;
        for(int i = 0; i < Rule.NUMBER_COUNT.value(); i++) {
            if(computerNumbers.get(i) == userNumbers.get(i)) {
                strike++;
            }
        }
    }
}
