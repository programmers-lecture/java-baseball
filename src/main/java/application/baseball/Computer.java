package application.baseball;

import application.generator.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private RandomNumberGenerator randomNumberGenerator;
    private List<Integer> answer;

    public Computer() {
        this.answer = new ArrayList<>();
    }

    public void createAnswer() {
        this.answer = randomNumberGenerator.generate();
    }
}
