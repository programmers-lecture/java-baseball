package application.input;

import application.baseballgame.UserChoice;
import application.baseballgame.Rule;
import application.output.Output;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {
    Scanner kb;

    public Input() {
        this.kb = new Scanner(System.in);
    }
    public int userChoice() {
        Output.printUserChoiceInputRequestMessage();
        int input = kb.nextInt();
        if(!isValidChoice(input)) {
            throw new IllegalArgumentException("Illegal Argument : " + input);
        }
        return input;
    }

    public List<Integer> userNumbers() {
        Output.printUserNumbersInputRequestMessage();
        String input = kb.nextLine();
        if(!isValidUserNumbers(input)) {
            throw new IllegalArgumentException("Illegal Argument : " + input);
        }
        return stringToIntegerList(input);
    }

    private boolean isValidChoice(int input) {
        return UserChoice.contains(input);
    }

    private boolean isValidUserNumbers(String input) {
        return Arrays.stream(input.split("")).distinct().count() == Rule.NUMBER_COUNT.value();
    }

    private List<Integer> stringToIntegerList(String input) {
        return Arrays.stream(input.split(""))
                .filter(num -> num.compareTo("1") >= 0 && num.compareTo("9") <= 0)
                .mapToInt(str -> Integer.valueOf(str))
                .boxed()
                .collect(Collectors.toList());
    }
}
