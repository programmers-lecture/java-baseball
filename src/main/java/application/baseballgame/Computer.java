package application.baseballgame;

import application.numbergenerator.NumberGenerator;
import application.numbergenerator.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Computer extends Player{
    public void setNumbers() {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        List<Integer> numbers = new ArrayList<>();
        while(numbers.size() < Rule.NUMBER_COUNT.value()) {
            int number = numberGenerator.generate();
            if(!numbers.contains(number)) numbers.add(number);
        }
        this.numbers = numbers;
    }
}