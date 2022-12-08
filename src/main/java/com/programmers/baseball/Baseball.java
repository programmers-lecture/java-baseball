package com.programmers.baseball;

import java.util.Random;
import java.util.stream.IntStream;

public class Baseball {
    public static void main(String[] args) {
        final int NUMBER_SIZE = 3;

        Random random = new Random();
        int[] computerNumber = IntStream.generate(() -> random.nextInt(9) + 1).distinct().limit(NUMBER_SIZE).toArray();
    }
}