package baseballgame.view;

import baseballgame.model.ConfirmType;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {
    private static final String GUIDE_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String NOT_DIGIT_EXCEPTION_MESSAGE = "오류: 입력한 값이 숫자가 아닙니다.";
    private static final String NOT_VALID_SIZE_EXCEPTION_MESSAGE = "오류: 3개의 숫자만 입력야합니다.";
    private static final String WRONG_CHOICE_EXCEPTION_MESSAGE = "오류: 1 또는 2만 입력해야합니다.";
    private static final int CONFIRM = 1;
    private static final int DECLINE = 2;
    private static final int VALID_SIZE = 3;

    private final Scanner scanner = new Scanner(System.in);

    public ArrayList<Integer> readNumber() {
        System.out.print(GUIDE_MESSAGE);
        String inputNumber = scanner.nextLine();
        checkValidInput(inputNumber);

        String[] numberArray = inputNumber.split("");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number : numberArray) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }

    public ConfirmType readConfirmType() {
        int confirmType = scanner.nextInt();
        if (confirmType == CONFIRM) {
            return ConfirmType.CONFIRM;
        }
        if (confirmType == DECLINE) {
            return ConfirmType.DECLINE;
        }

        throw new IllegalArgumentException(WRONG_CHOICE_EXCEPTION_MESSAGE);
    }

    public void clearInput() {
        scanner.nextLine();
    }

    void checkValidInput(String inputNumber) {
        if (!isDigit(inputNumber)) {
            throw new IllegalStateException(NOT_DIGIT_EXCEPTION_MESSAGE);
        }
        if (!isValidSize(inputNumber)) {
            throw new IllegalStateException(NOT_VALID_SIZE_EXCEPTION_MESSAGE);
        }
    }

    private boolean isDigit(String inputNumber) {
        try {
            Integer.parseInt(inputNumber);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidSize(String inputNumber) {
        return inputNumber.length() == VALID_SIZE;
    }
}
