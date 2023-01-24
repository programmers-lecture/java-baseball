package application.baseballGame;

public class GameResult {
    private final int MAX = BaseballGame.NUMBER_COUNT_RULE;
    private final int MIN = 0;

    private int ball;
    private int strike;

    public void printResult() {
        if(strike == MIN) {
            System.out.println("낫싱");
            return;
        }
        if(strike == MAX) {
            System.out.println(strike + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
            return;
        }
        System.out.println(ball + "볼 " + strike + "스트라이크");
    }

    public void setResult(Player computer, Player user) {
        int strike = MIN;
        for(int computerNumber : computer.getNumbers()) {
            if(computerNumber == user.getNumbers().remove(0)) strike++;
        }
        this.ball = MAX - strike;
        this.strike = strike;
    }

    public boolean isWin() {
        return strike == MAX;
    }
}
