package baseballgame.service;

import baseballgame.model.RandomNumber;

import java.util.*;

public class RandomNumberGenerator {
    private static final int BALL_SIZE = 3;
    private static final int MAX_BALL_NUMBER = 9;
    private static final int BOUNDARY_NUMBER = 1;

    public Set<Integer> createRandomNumber() {
        Set<Integer> set = new LinkedHashSet<>();
        fillNumbers(set);
        return set;
    }

    private void fillNumbers(Set<Integer> set) {
        Random random = new Random();

        while (set.size() != BALL_SIZE) {
            int randomNumber = random.nextInt(MAX_BALL_NUMBER) + BOUNDARY_NUMBER;
            set.add(randomNumber);
        }
    }
}
