package baseballgame.model;

import java.util.Collection;
import java.util.Set;

public class RandomNumber {
    private final Set<Integer> randomNumber;

    public RandomNumber(Set<Integer> randomNumber) {
        this.randomNumber = randomNumber;
    }

    public Collection<? extends Integer> getRandomNumber() {
        return randomNumber;
    }
}
