package application.baseballgame.gameresult;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameResultTest {

    private static GameResult gameResult1;
    private static GameResult gameResult2;
    private static GameResult gameResult3;
    private static GameResult gameResult4;

    @BeforeAll
    static void init() {
        gameResult1 = new GameResult();
        gameResult2 = new GameResult();
        gameResult3 = new GameResult();
        gameResult4 = new GameResult();

        List<Integer> computerNumbers1 = Arrays.asList(1, 2, 3);
        List<Integer> userNumbers1 = Arrays.asList(1, 2, 3);
        List<Integer> computerNumbers2 = Arrays.asList(1, 4, 3);
        List<Integer> userNumbers2 = Arrays.asList(1, 2, 3);
        List<Integer> computerNumbers3 = Arrays.asList(5, 7, 3);
        List<Integer> userNumbers3 = Arrays.asList(1, 2, 5);
        List<Integer> computerNumbers4 = Arrays.asList(5, 7, 8);
        List<Integer> userNumbers4 = Arrays.asList(1, 2, 3);

        gameResult1.setThrowingResults(computerNumbers1, userNumbers1);
        gameResult2.setThrowingResults(computerNumbers2, userNumbers2);
        gameResult3.setThrowingResults(computerNumbers3, userNumbers3);
        gameResult4.setThrowingResults(computerNumbers4, userNumbers4);
    }

    @DisplayName("throwingResults에 오직 strike만 있으면 true")
    @Test
    void isWin() {
        assertThat(gameResult1.isWin()).isEqualTo(true);
        assertThat(gameResult2.isWin()).isEqualTo(false);
        assertThat(gameResult3.isWin()).isEqualTo(false);
        assertThat(gameResult4.isWin()).isEqualTo(false);
    }
}