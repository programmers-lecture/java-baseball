package application.baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer extends Player{
    public void setNumbers() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        while(numbers.size() < BaseballGame.NUMBER_COUNT_RULE) {
            int number = random.nextInt(9) + 1;
            if(!numbers.contains(number)) numbers.add(number);
        }
        this.numbers = numbers;
    }
}