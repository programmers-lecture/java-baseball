import model.FixedNumberGenerator;
import model.GuessNumber;
import model.NumberGenerator;
import model.RandomNumberGenerator;

import java.util.LinkedHashSet;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] answer = sc.nextLine().split("");

        GuessNumber guessNumber = new GuessNumber();
        String randomNumber = guessNumber.generate(generateRandNum());
        String fixedNumber = guessNumber.generate(generateFixedNum());
        System.out.println(fixedNumber);
        System.out.println(randomNumber);
    }

    public static FixedNumberGenerator generateFixedNum() {
        return new FixedNumberGenerator();
    }

    public static RandomNumberGenerator generateRandNum() {
        return new RandomNumberGenerator();
    }
}



//        // ball 판정
//        int ball = 0;
//
//        for (int i = 0; i < answer.length; i++){
//            if ((answer[i] != guess[i]) & set.contains(guess[i])) {
//                ball += 1;
//            }
//        }
//
//        //strike 판정
//        int strike = 0;
//        for (int i = 0; i < answer.length; i++){
//            if (answer[i] == guess[i]) {
//                strike += 1;
//            }
//        }
//
//        //out 판정
//        int out = 0;
//
//        for (int i = 0; i < answer.length; i++){
//            if (!set.contains(guess[i])) {
//                out += 1;
//            }
//            if (out == answer.length){
//                System.out.println("out");
//            }
//        }
//
//        //correct 판정
//        int  correct = 0;
//
//        for (int i = 0; i < answer.length; i++){
//            if (guess[i] == answer[i]) {
//                correct += 1;
//            }
//            if (correct == answer.length){
//                System.out.println("correct");
//            }
//        }

