package application.baseballGame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class User extends Player{
    @Override
    public void setNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(""))
                .filter(num -> num.compareTo("1") >= 0 && num.compareTo("9") <= 0)
                .mapToInt(str -> Integer.valueOf(str))
                .boxed()
                .collect(Collectors.toList());
        if(numbers.size() != BaseballGame.NUMBER_COUNT_RULE) {
            throw new IllegalArgumentException("Illegal Argument : " + input);
        }
        this.numbers = numbers;
    }
}
