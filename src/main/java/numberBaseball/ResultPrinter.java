package numberBaseball;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import game.Result;

@RequiredArgsConstructor
public class ResultPrinter {
    private final static String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private final static String BALL = "볼";
    private final static String STRIKE = "스트라이크";

    private final static String NOTHING = "낫싱";
    @Getter
    private final static String END_MESSAGE = "개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
            "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private final Integer numberOfElements;

    public boolean print(Result result){
        if(result.isNothing()) System.out.println(NOTHING);
        String ballMessage = result.isBall()?result.getBalls()+BALL:"";
        String strikeMessage = result.isStrike()?result.getStrikes()+STRIKE:"";
        System.out.println(ballMessage+" "+strikeMessage);
        if(result.isCorrect()) System.out.println(numberOfElements + END_MESSAGE);
        return result.isCorrect();
    }

    public void printStartMessage(){
        System.out.println(INPUT_MESSAGE);
    }
}
