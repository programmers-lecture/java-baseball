package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static baseball.BaseballGame.NUMBER_SIZE;

public class View {
    private Scanner scanner;
    private String ENTER_NUMBERS = "숫자를 입력해주세요 : ";
    private String OUT_MESSAGE = "아웃";
    private String BALL_MESSAGE = "볼";
    private String STRIKE_MESSAGE = "스트라이크";
    private String GAME_CLEAR_MESSAGE = NUMBER_SIZE + "개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private String END_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    View() {
        this.scanner = new Scanner(System.in);
    }

    public String input() {
        return this.scanner.nextLine();
    }

    public String getNumbers() {
        System.out.printf(ENTER_NUMBERS);
        String numbers = input();
        if (!numbers.matches("[0-9]+") || numbers.length() != NUMBER_SIZE){
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
        return numbers;
    }

    public void printBall(int ball) {
        if (ball != 0) {
            System.out.print(ball + BALL_MESSAGE + ' ');
        }
    }

    public void printStrike(int strike) {
        if (strike != 0) {
            System.out.print(strike + STRIKE_MESSAGE);
        }
    }

    public void printOut() {
        System.out.println(OUT_MESSAGE);
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
        System.out.println(GAME_CLEAR_MESSAGE);
        System.out.println(END_MESSAGE);
        return this.scanner.nextLine();
    }
}
