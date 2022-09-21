package baseball.view;

public class OutputView {

    private static final String REQUEST_NUMBER_MSG = "숫자를 입력해주세요 : ";
    public static final String ASK_REPLAY_MSG = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printRequestNumberMSG() {
        System.out.printf(REQUEST_NUMBER_MSG);
    }

    public static void printString(String value) {
        System.out.println(value);
    }

    public static void printAskReplay() {
        printString(ASK_REPLAY_MSG);
    }

}
