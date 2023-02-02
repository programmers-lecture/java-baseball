package application.output;

import application.baseballgame.Rule;
import application.baseballgame.gameresult.ThrowingResult;

import java.util.List;

public class Output {
    public static void printUserChoiceInputRequestMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printUserNumbersInputRequestMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printGameResult(List<ThrowingResult> throwingResults) {
        int ballCount = getCount(throwingResults, ThrowingResult.BALL);
        int strikeCount = getCount(throwingResults, ThrowingResult.STRIKE);
        if (ballCount == 0 && strikeCount == 0) {
            System.out.println("낫싱");
            return;
        }
        if (strikeCount == 0) {
            System.out.println(ballCount + "볼");
            return;
        }
        if (ballCount == 0) {
            if (strikeCount == Rule.NUMBER_COUNT.value()) {
                System.out.println(strikeCount + "스트라이크");
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                return;
            }
            System.out.println(strikeCount + "스트라이크");
            return;
        }
        System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
    }

    private static int getCount(List<ThrowingResult> throwingResults,
            ThrowingResult throwingResult) {
        return (int) throwingResults.stream()
                .filter(result -> result.equals(throwingResult))
                .count();
    }
}
