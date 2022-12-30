package game;

import baseball.Baseball;
import baseball.Result;
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class Game<T> {
    private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String NOTHING = "낫싱";
    private final static String END_MESSAGE =
            Setting.MAX_NUMBER_OF_ELEMENTS + "개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
            "게임을 새로 시작하려면 " + Setting.MENU_START +
            ", 종료하려면 " + Setting.MENU_STOP + "를 입력하세요.";

    private Parser<T> parser;
    private Baseball<T> baseball;

    public boolean startAndGetIsEnd(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(INPUT_MESSAGE);
            String input = sc.next();
            Result result = baseball.tryNew(parser.parse(input));
            printResult(result);

            if(result.isStrike()){
                System.out.println(END_MESSAGE);
                input = sc.next();
                if(Setting.MENU_STOP.equals(input)) return true;
                if(Setting.MENU_START.equals(input)) return false;
            }
        }
    }

    private void printResult(Result result){
        if(result.isNothing()) System.out.println(NOTHING);
        String ballMessage = result.isBall()?result.getBalls()+BALL+" ":"";
        String strikeMessage = result.isStrike()?result.getStrikes()+STRIKE:"";
        System.out.println(ballMessage+strikeMessage);
        if(result.isCorrect()) System.out.println(Setting.MAX_NUMBER_OF_ELEMENTS + END_MESSAGE);
    }
}
