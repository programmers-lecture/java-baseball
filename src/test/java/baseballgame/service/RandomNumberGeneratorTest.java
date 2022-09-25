package baseballgame.service;

import baseballgame.controller.BaseballGame;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.function.Supplier;

class RandomNumberGeneratorTest {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @Test
    void createRandomNumber() {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.run();
    }

    @Test
    void 람다_테스트() {
        Supplier<Integer> supplier = () -> 30 + 50;
        System.out.println(supplier.get());
    }
}