package application.model;

import application.constant.Config;

import java.util.*;
import java.util.stream.Collectors;

public class Player {
    private List<Integer> numbers;
    private final Set<Integer> numberSet;

    public Player() {
        this.numberSet = new LinkedHashSet<>();
    }

    public List<Integer> getNumbers() {
        return this.numbers;
    }

    public void generateNumbers(String[] inputs) {
        this.numbers = new ArrayList<>();

        isBaseballGameSize(inputs);
        isMatch(inputs);

        buildNumbers(inputs);

        clearSet();
    }

    private void isBaseballGameSize(String[] inputs) {
        if(inputs.length > Config.BASEBALL_GAME_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    private void isMatch(String[] inputs) {
        for(String input : inputs) {
            if(!input.matches("[1-9]+")) {
                throw new IllegalArgumentException();
            }
            int number = Integer.parseInt(input);
            if(isExist(number)) {
                throw new IllegalArgumentException();
            }
        }
    }

    private boolean isExist(Integer number) {
        if(!numberSet.contains(number)) {
            numberSet.add(number);
            return false;
        }
        return true;
    }

    private void buildNumbers(String[] inputs) {
        this.numbers = Arrays.stream(inputs)
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }

    private void clearSet() {
        numberSet.clear();
    }
}
