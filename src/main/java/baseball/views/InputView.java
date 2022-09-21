package baseball.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    private InputView() {}

    public static String[] inputPlayerNumber() {
        System.out.println("숫자를 입력해주세요 : ");
        String[] playerNumber = scanner.next().split("");
        if(playerNumber.length > 3)
            throw new IllegalArgumentException();
        return playerNumber;
    }

    public static boolean inputRerunOrNot() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        return scanner.next().equals("1");
    }
}
