package baseball.views;

import baseball.models.Baseball;

public class OutputView {
    private OutputView() {}

    public static void printBaseballResult(String baseballResult) {
        System.out.println(baseballResult);
    }

    public static void printBaseballEnd() {
        System.out.println(Baseball.BALL_SIZE + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
