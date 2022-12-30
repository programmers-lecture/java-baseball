package com.programmers.baseball;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Baseball {
    public static void main(String[] args) {
        final int NUMBER_SIZE = 3;
        int gameOnGoing = 1;

        while (gameOnGoing==1) {
            Random random = new Random();
            int[] computerNumber = IntStream.generate(() -> random.nextInt(9) + 1).distinct().limit(NUMBER_SIZE).toArray();

            int strike = 0;
            int ball = 0;

            while (strike != 3) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("숫자를 입력해주세요 : ");

                int[] guessNumber = Stream.of(String.valueOf(scanner.nextInt()).split("")).mapToInt(Integer::parseInt).toArray();
                if (guessNumber.length != NUMBER_SIZE) throw new IllegalArgumentException(NUMBER_SIZE + "자리의 수를 입력하세요.");

                boolean duplicated = Arrays.stream(guessNumber).distinct().count() != guessNumber.length;
                if (duplicated) throw new IllegalArgumentException("각 자리의 값을 중복되지 않게 입력해주세요.");

                strike = 0;

                for (int i = 0; i < NUMBER_SIZE; i++) {
                    for (int j = 0; j < NUMBER_SIZE; j++) {
                        if (i == j) {
                            if (computerNumber[i] == guessNumber[j]) {
                                strike++;
                            }
                        } else {
                            if (computerNumber[i] == guessNumber[j]) {
                                ball++;
                            }
                        }
                    }
                }

                if (ball != 0) System.out.print(ball + "볼 ");
                if (strike != 0) System.out.print(strike + "스트라이크 ");
                if (ball == 0 && strike == 0) System.out.print("낫싱");
                System.out.println();

                if (strike == NUMBER_SIZE) {
                    System.out.println(NUMBER_SIZE + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    gameOnGoing = scanner.nextInt();
                }
            }
        }
    }
}