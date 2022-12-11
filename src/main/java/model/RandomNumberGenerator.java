package model;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public String[] generate() {
        int[] guessInt = new int[3];
        for(int i = 0; i < guessInt.length; i++){
            guessInt[i] = noDuplicate(guessInt);
        }
        String[] guess = Arrays.stream(guessInt)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        return guess;

    }

    private int noDuplicate(int[] guessInt){
        int temp = (int) (Math.random() * 9);
        while (guessInt[0] == temp || guessInt[1] == temp){
            temp = (int) (Math.random() * 9)+1;
        }
        return temp;
    }

}
