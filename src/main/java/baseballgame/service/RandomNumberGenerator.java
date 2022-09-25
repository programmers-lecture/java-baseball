package baseballgame.service;

import java.util.*;

public class RandomNumberGenerator {
    private static final int BALL_SIZE = 3;

    public Set<Integer> createRandomNumber() {
        Set<Integer> set = new LinkedHashSet<>();
        fillNumbers(set);
        return set;
    }

    private void fillNumbers(Set<Integer> set) {
        Random random = new Random();

        while (set.size() != BALL_SIZE) {
            int randomNumber = random.nextInt(9) + 1;
            set.add(randomNumber);
        }
    }
}
