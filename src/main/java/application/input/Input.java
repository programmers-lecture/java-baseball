package application.input;

import application.baseballgame.player.UserChoice;
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
        validChoice(input);
        return input;
    }

    public List<Integer> userNumbers() {
        Output.printUserNumbersInputRequestMessage();
        String input = kb.nextLine();
        validUserNumbers(input);
        return stringToIntegerList(input);
    }

    private void validChoice(int input) {
        if (!UserChoice.contains(input)) {
            throw new IllegalArgumentException("Illegal Argument : " + input);
        }
    }

    private void validUserNumbers(String input) {
        long validNumberCount = Arrays.stream(input.split("")).distinct().count();
        if (validNumberCount != Rule.NUMBER_COUNT.value()) {
            throw new IllegalArgumentException("Illegal Argument : " + input);
        }
    }

    private List<Integer> stringToIntegerList(String input) {
        return Arrays.stream(input.split(""))
                .filter(num -> num.compareTo("1") >= 0 && num.compareTo("9") <= 0)
                .mapToInt(Integer::valueOf)
                .boxed()
                .collect(Collectors.toList());
    }
}
