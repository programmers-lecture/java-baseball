package application.model;

import application.generator.FixedNumberGenerator;
import application.generator.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private RandomNumberGenerator randomNumberGenerator;
    private FixedNumberGenerator fixedNumberGenerator;
    private List<Integer> answer;

    public Computer() {
        this.answer = new ArrayList<>();
        this.randomNumberGenerator = new RandomNumberGenerator();
        this.fixedNumberGenerator = new FixedNumberGenerator();
    }

    public void createAnswerWithRandom() {
        this.answer = randomNumberGenerator.generate();
    }

    public void createAnswerWithFixed() {
        this.answer = fixedNumberGenerator.generate();
    }

    public List<Integer> getAnswer() {
        return this.answer;
    }
}
