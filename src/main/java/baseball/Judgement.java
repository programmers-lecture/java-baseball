package baseball;

import java.util.ArrayList;

public class Judgement {
    public int countStrike(String numbers, String answer) {
        int strike = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == (answer.charAt(i))) {
                strike++;
            }
        }
        return strike;
    }

    public int countBall(String numbers, String answer) {
        int ball = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (answer.contains(numbers.substring(i, i+1))
                    && answer.indexOf(numbers.charAt(i)) != i) {
                ball++;
            }
        }
        return ball;
    }
}
