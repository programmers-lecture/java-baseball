package application.constant;

public class Message {
    private static final String INPUT_NUMBER_TO_PLAY = "숫자를 입력해주세요. : ";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String THREE_STRIKE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RETRY = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String getInputNumberToPlay() {
        return INPUT_NUMBER_TO_PLAY;
    }

    public static String getStatus(int ball, int strike) {
        return getBall(ball) + getStrike(strike);
    }
    public static String getThreeStrike() {
        return THREE_STRIKE;
    }

    public static String getRetry() {
        return RETRY;
    }

    private static String getBall(int ball) {
        return ball > 0 ? ball+BALL : "";
    }

    private static String getStrike(int strike) {
        return strike > 0 ? strike+STRIKE : "";
    }

}
