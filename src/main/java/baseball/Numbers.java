package baseball;

import java.util.*;

public class Numbers {
    private int size;
    private ArrayList<Integer> numberList;
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    Numbers(int size) {
        this.size = size;
        HashSet<Integer> numberSet = new HashSet<Integer>();
        while (numberSet.size() < size) {
            numberSet.add(randomNumberGenerator.generate());
        }
        numberList = new ArrayList<>(numberSet);
    }
}