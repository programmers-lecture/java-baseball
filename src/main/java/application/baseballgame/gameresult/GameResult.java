package application.baseballgame.gameresult;

import application.baseballgame.Rule;
import application.output.Output;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
    private static final int MAX = Rule.NUMBER_COUNT.value();
    private List<ThrowingResult> throwingResults;

    public GameResult() {
        this.throwingResults = new ArrayList<>();
    }

    public void printResult() {
        Output.printGameResult(throwingResults);
    }

    public boolean isWin() {
        long strikeCount = throwingResults.stream()
                .filter(result -> result.equals(ThrowingResult.STRIKE))
                .count();
        return strikeCount == MAX;
    }

    public void setThrowingResults(List<Integer> computerNumbers, List<Integer> userNumbers) {
        throwingResults.clear();
        for (int i = 0; i < Rule.NUMBER_COUNT.value(); i++) {
            throwingResults.add(
                    ThrowingResult.getResult(computerNumbers, i, userNumbers.get(i)));
        }
    }
}
