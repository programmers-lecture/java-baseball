package baseballgame.view;

import baseballgame.model.ConfirmType;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);
    private static final int CONFIRM = 1;
    private static final int DECLINE = 2;

    public ConfirmType readConfirmType() {
        int confirmType = scanner.nextInt();

        if (confirmType == CONFIRM) {
            return ConfirmType.CONFIRM;
        }
        return ConfirmType.DECLINE;
    }
}
