package baseball;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    View() {
        this.scanner = new Scanner(System.in);
    }

    public String input() {
        return this.scanner.nextLine();
    }

    public String getNumbers() {
        System.out.printf(Constant.ENTER_NUMBERS);
        String numbers = input();
        if (!numbers.matches("[0-9]+") || numbers.length() != Constant.NUMBER_SIZE){
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
        return numbers;
    }

    public void printBall(int ball) {
        if (ball != 0) {
            System.out.print(ball + Constant.BALL_MESSAGE + ' ');
        }
    }

    public void printStrike(int strike) {
        if (strike != 0) {
            System.out.print(strike + Constant.STRIKE_MESSAGE);
        }
    }

    public void printOut() {
        System.out.println(Constant.OUT_MESSAGE);
    }

    public void printResult(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            printOut();
        }
        else {
            printBall(ball);
            printStrike(strike);
            System.out.print('\n');
        }
    }
    public String gameEnd() {
        String value;
        System.out.println(Constant.GAME_CLEAR_MESSAGE);
        System.out.println(Constant.END_MESSAGE);
        value = scanner.nextLine();
        while (!value.equals(Constant.CONTINUE) && !value.equals(Constant.END)) {
            System.out.println(Constant.END_MESSAGE);
            value = scanner.nextLine();
        }
        return value;
    }
}
