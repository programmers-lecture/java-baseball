package baseball;

public class Computer {
    private Numbers numbers;

    Computer() {
        this.numbers = new Numbers(Constant.NUMBER_SIZE);
    }

    public String getComputerNumbers() {
        return numbers.getNumberString();
    }
}
