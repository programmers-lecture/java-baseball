package application.baseballgame.player;

import application.baseballgame.Rule;
import application.numbergenerator.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Computer extends Player {
    public void setNumbers(NumberGenerator numberGenerator) {
        List<Integer> numbers = new ArrayList<>();
        while(numbers.size() < Rule.NUMBER_COUNT.value()) {
            int number = numberGenerator.generate();
            if(!numbers.contains(number)) numbers.add(number);
        }
        this.numbers = numbers;
    }
}