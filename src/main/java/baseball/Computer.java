package baseball;

import static baseball.BaseballGame.NUMBER_SIZE;

public class Computer {
    private Numbers numbers;

    Computer() {
        this.numbers = new Numbers(NUMBER_SIZE);
    }

    public String getComputerNumbers() {
        return numbers.getNumberString();
    }
}
