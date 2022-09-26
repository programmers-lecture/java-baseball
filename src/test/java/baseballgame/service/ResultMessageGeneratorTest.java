package baseballgame.service;

import baseballgame.model.RandomNumber;
import baseballgame.view.OutputView;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ResultMessageGeneratorTest {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final ResultMessageGenerator resultMessageGenerator = new ResultMessageGenerator();
    private final Referee referee = new Referee();
    private final OutputView outputView = new OutputView();

    @Test
    void 결과_메시지() {
        ArrayList<Integer> userNumber = new ArrayList<>();
        userNumber.add(1);
        userNumber.add(1);
        userNumber.add(1);

        Set<Integer> set = new LinkedHashSet<>();
        set.add(3);
        set.add(4);
        set.add(1);

        RandomNumber randomNumber = new RandomNumber(set);
        System.out.println(randomNumber.getRandomNumber());

        referee.judge(userNumber, new ArrayList<>(randomNumber.getRandomNumber()));

        outputView.printMessage(resultMessageGenerator.generateJudgmentMessage());
    }
}