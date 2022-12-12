import model.FixedNumberGenerator;
import model.AnswerNumber;
import model.JudgeCount;
import model.RandomNumberGenerator;
import view.InputView;
import view.OutputView;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // 숫자 생성
        AnswerNumber answerNumber = new AnswerNumber();
        String[] randomNumber = answerNumber.generate(generateRandNum());
        String[] fixedNumber = answerNumber.generate(generateFixedNum());
        System.out.println(Arrays.toString(randomNumber));

        //판정 및 출력
        while (true){
            String[] guessNumber = InputView.input();
            if (JudgeCount.CORRECT.judge(randomNumber,guessNumber) == 1) {
                OutputView.output("정답입니다!!");
                break;
            }
            int ball = JudgeCount.BALL.judge(randomNumber,guessNumber);
            int strike = JudgeCount.STRIKE.judge(randomNumber,guessNumber);
            if (ball == 0 && strike == 0){
                OutputView.output("아웃입니다.");
                continue;
            }
            OutputView.output(ball+"볼 "+strike+"스트라이크");
        }
    }

    public static FixedNumberGenerator generateFixedNum() {
        return new FixedNumberGenerator();
    }

    public static RandomNumberGenerator generateRandNum() {
        return new RandomNumberGenerator();
    }
}

