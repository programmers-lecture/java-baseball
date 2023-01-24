package application;

import application.baseballGame.BaseballGame;

import java.util.Scanner;

public class Application {
    private static boolean again = true;

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        Scanner kb = new Scanner(System.in);
        while(again) {
            baseballGame.run();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int input = kb.nextInt();
            if(!(input == 1 || input == 2)) {
                throw new IllegalArgumentException("Illegal Argument : " + input);
            }
            if(input == 2) again = false;
        }
    }
}