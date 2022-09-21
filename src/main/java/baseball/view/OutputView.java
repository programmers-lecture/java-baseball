package baseball.view;

public class OutputView {

    private static final String REQUEST_NUMBER_MSG = "숫자를 입력해주세요 : ";

    public static void printRequestNumberMSG() {
        System.out.printf(REQUEST_NUMBER_MSG);
    }

    public static void printString(String value){
        System.out.println(value);
    }

}
