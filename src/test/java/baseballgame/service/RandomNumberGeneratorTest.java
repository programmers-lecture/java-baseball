package baseballgame.service;

import org.junit.jupiter.api.Test;

import java.util.Set;

class RandomNumberGeneratorTest {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @Test
    void createRandomNumber() {
        for (int i = 0; i < 100; i++) {
            Set<Integer> randomNumber = randomNumberGenerator.createRandomNumber();
            System.out.println("randomNumber = " + randomNumber);
        }
    }
}