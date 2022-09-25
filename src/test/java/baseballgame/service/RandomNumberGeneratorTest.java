package baseballgame.service;

import baseballgame.controller.BaseballGame;
import org.junit.jupiter.api.Test;

import java.util.Set;

class RandomNumberGeneratorTest {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @Test
    void createRandomNumber() {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.run();
    }
}