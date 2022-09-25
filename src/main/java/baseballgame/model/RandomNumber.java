package baseballgame.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class RandomNumber {
    private final Set<Integer> randomNumber;

    public RandomNumber(Set<Integer> randomNumber) {
        this.randomNumber = randomNumber;
    }

    public Set<Integer> getRandomNumber() {
        return randomNumber;
    }
}
