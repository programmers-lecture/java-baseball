import model.FixedNumberGenerator;
import model.AnswerNumber;
import model.RandomNumberGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        AnswerNumber answerNumber = new AnswerNumber();
        String[] randomNumber = answerNumber.generate(generateRandNum());
        String[] fixedNumber = answerNumber.generate(generateFixedNum());
        System.out.println(Arrays.toString(randomNumber));
        System.out.println(Arrays.toString(fixedNumber));

        System.out.println(JudgeCount.BALL.judge(fixedNumber,randomNumber));
        System.out.println(JudgeCount.STRIKE.judge(fixedNumber,randomNumber));
        System.out.println(JudgeCount.CORRECT.judge(fixedNumber,randomNumber));
        System.out.println(JudgeCount.OUT.judge(fixedNumber,randomNumber));


    }

    public static FixedNumberGenerator generateFixedNum() {
        return new FixedNumberGenerator();
    }

    public static RandomNumberGenerator generateRandNum() {
        return new RandomNumberGenerator();
    }
}

