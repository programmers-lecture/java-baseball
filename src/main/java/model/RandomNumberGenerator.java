package model;

import java.util.LinkedHashSet;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public String generate() {

        Set<String> guess = new LinkedHashSet<>();
        for(int i = 0; i < 3; i++){
            String temp = Integer.toString((int) (Math.random() * 10));
            if(!guess.contains(temp)){ guess.add(temp); }
        }
        return guess.toString();
    }
}
