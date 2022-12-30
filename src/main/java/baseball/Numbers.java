package baseball;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    private int size;
    private String numberString;
    private HashSet<Integer> numberSet;
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    Numbers(int size) {
        this.size = size;
        numberSet = new HashSet<Integer>();
        while (numberSet.size() < size) {
            numberSet.add(randomNumberGenerator.generate());
        }
        numberString = numberSet.stream().map(Object::toString).collect(Collectors.joining());
    }

    public String getNumberString() {
        return numberString;
    }
}