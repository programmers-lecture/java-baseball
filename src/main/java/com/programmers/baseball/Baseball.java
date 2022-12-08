package com.programmers.baseball;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Baseball {
    public static void main(String[] args) {
        final int NUMBER_SIZE = 3;

        Random random = new Random();
        int[] computerNumber = IntStream.generate(() -> random.nextInt(9) + 1).distinct().limit(NUMBER_SIZE).toArray();

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");

        int[] guessNumber = Stream.of(String.valueOf(scanner.nextInt()).split("")).mapToInt(Integer::parseInt).toArray();
        if (guessNumber.length != NUMBER_SIZE) throw new IllegalArgumentException(NUMBER_SIZE + "자리의 수를 입력하세요.");
    }
}