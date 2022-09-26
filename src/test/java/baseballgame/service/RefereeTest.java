package baseballgame.service;

import baseballgame.model.GameStatus;
import baseballgame.model.RandomNumber;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {
    private final Referee referee = new Referee();
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @Test
    void 심판_테스트() {
        ArrayList<Integer> userNumber = new ArrayList<>();
        Set<Integer> test = new LinkedHashSet<>();
        test.add(1);
        test.add(4);
        test.add(3);
        RandomNumber randomNumber = new RandomNumber(test);
        userNumber.add(3);
        userNumber.add(3);
        userNumber.add(3);
        String gameResult = referee.judge(userNumber, new ArrayList<>(randomNumber.getRandomNumber()));
        for (GameStatus status : GameStatus.values()) {
            System.out.println(status.getState());
        }
    }
}