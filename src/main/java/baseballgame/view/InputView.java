package baseballgame.view;

import baseballgame.model.ConfirmType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputView {
    private static final String GUIDE_MESSAGE = "숫자를 입력해주세요 : ";
    private static final int CONFIRM = 1;
    private static final int DECLINE = 2;

    private final Scanner scanner = new Scanner(System.in);

    public ArrayList<Integer> readNumber() {
        System.out.print(GUIDE_MESSAGE);
        String[] inputNumber = scanner.nextLine().split("");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number : inputNumber) {
            numbers.add(Integer.valueOf(number));
        }

        return numbers;
    }

    public ConfirmType readConfirmType() {
        int confirmType = scanner.nextInt();

        if (confirmType == CONFIRM) {
            return ConfirmType.CONFIRM;
        }
        return ConfirmType.DECLINE;
    }
}
