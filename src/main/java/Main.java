import model.FixedNumberGenerator;
import model.AnswerNumber;
import model.RandomNumberGenerator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        AnswerNumber answerNumber = new AnswerNumber();
        String[] randomNumber = answerNumber.generate(generateRandNum());
        String[] fixedNumber = answerNumber.generate(generateFixedNum());
        System.out.println(Arrays.toString(randomNumber));
        System.out.println(Arrays.toString(fixedNumber));

        System.out.println(BaseballState.STRIKE.call(randomNumber, fixedNumber));
        System.out.println(BaseballState.BALL.call(randomNumber, fixedNumber));

//        while(true) {
//            String[] answer = sc.nextLine().split("");
//
//        }

    }

    public static FixedNumberGenerator generateFixedNum() {
        return new FixedNumberGenerator();
    }

    public static RandomNumberGenerator generateRandNum() {
        return new RandomNumberGenerator();
    }
}

