package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Play {

    private List<Integer> userNum = new ArrayList<>();
    String[] inputs = new String[3];

    public List<Integer> inputNum() {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        String input = sc.nextLine();
        inputs = input.split("");

        try {
            for (int i = 0; i < 3; i++) {
                userNum.add(i, Integer.parseInt(inputs[i]));
            }
        } catch (IllegalArgumentException e) {      // 사용자의 입력이 잘못된 경우 에러 발생
            throw new IllegalArgumentException();
        }
        return userNum;
    }

    // 볼, 스트라이크 판정
    public void referee(int strike, int ball) {
        if ((strike > 0) & (ball > 0)) System.out.println(ball + "볼 " + strike + "스트라이크");
        else if (strike > 0) System.out.println(strike + "스트라이크");
        else System.out.println(ball + "볼");
    }

    // 게임 재시작의 여부
    public int restartGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        int choice = sc.nextInt();

        return choice;
    }
}
