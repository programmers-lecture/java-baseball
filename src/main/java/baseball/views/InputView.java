package baseball.views;

import baseball.models.Baseball;

import java.util.Scanner;

public class InputView {
    private InputView() {}

    public static String[] inputPlayerNumber() {
        System.out.println("숫자를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String[] playerNumber = scanner.next().split("");
        if(playerNumber.length > Baseball.BALL_SIZE)
            throw new IllegalArgumentException();
        return playerNumber;
    }

    public static boolean inputRerunOrNot() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().equals("1");
    }
}
