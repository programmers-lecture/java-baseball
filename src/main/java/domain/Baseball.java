package domain;

import java.util.List;

public class Baseball {

    public static void main(String[] args) {

        Play play = new Play();
        RandomValue randomValue = new RandomValue();
        Compare compare = new Compare();

        // 정답 생성
        List<Integer> answer = randomValue.answerNum();

        while(true) {
            List<Integer> userNum = play.inputNum();
            int strike = compare.countStrike(userNum, answer);
            int ball = compare.countBall(userNum, answer);

            play.referee(strike, ball);

            // 정답을 맞췄을시
            if(strike == 3) {
                int choice = play.restartGame();

                // 게임을 계속 진행할 시
                if(choice == 1) answer = randomValue.answerNum();
                // 게임을 종료할 시
                else break;
            }
        }
    }
}
