package domain;

import java.util.List;

public class Baseball {

    public static void main(String[] args) {

        Play play = new Play();
        RandomValue randomValue = new RandomValue();
        Compare compare = new Compare();

        List<Integer> answer = randomValue.answerNum();
        for(int i=0; i<answer.size(); i++) System.out.print(answer.get(i));
        System.out.println();

        while(true) {
            List<Integer> userNum = play.inputNum();
            int strike = compare.countStrike(userNum, answer);
            int ball = compare.countBall(userNum, answer);

            play.referee(strike, ball);

            if(strike == 3) {
                int choice = play.restartGame();

                if(choice == 1) answer = randomValue.answerNum();
                else break;
            }
        }
    }
}
