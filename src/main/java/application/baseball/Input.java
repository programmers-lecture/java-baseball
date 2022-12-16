package application.baseball;

import application.constant.Config;

import java.util.*;


public class Input {
    private final Scanner scanner;
    private final Set<Integer> numberSet;

    public Input() {
        this.scanner = new Scanner(System.in);
        this.numberSet = new LinkedHashSet<>();
    }

    public int getRetry() {
        String code = scanner.next();
        if(!code.matches("[1-2]+")) {
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(code);
    }

    public List<Integer> getNumber() {
        List<Integer> inputNumber = new ArrayList<>();

        String[] inputs = scanner.next().split("");
        if(inputs.length > Config.BASEBALL_GAME_SIZE) {
            throw new IllegalArgumentException();
        }
        for(String input : inputs) {
            if(!input.matches("[1-9]+")) {
                throw new IllegalArgumentException();
            }
            int number = Integer.parseInt(input);
            if(isExist(number)) {
                throw new IllegalArgumentException();
            }
            inputNumber.add(number);
        }
        clear();
        return inputNumber;
    }

    private boolean isExist(Integer number) {
        if(!numberSet.contains(number)) {
            numberSet.add(number);
            return false;
        }
        return true;
    }

    private void clear() {
        numberSet.clear();
    }
}
