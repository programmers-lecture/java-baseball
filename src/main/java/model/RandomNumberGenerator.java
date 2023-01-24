package model;
import java.util.Arrays;

public class RandomNumberGenerator implements NumberGenerator {
    @Override
    public String[] generate() {
        int[] generateNum = new int[3];
        for(int i = 0; i < generateNum.length; i++){
            generateNum[i] = noDuplicate(generateNum);
        }
        String[] guess = Arrays.stream(generateNum)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        return guess;

    }

    private int noDuplicate(int[] generateNum){
        int temp = (int) (Math.random() * 9);
        while (generateNum[0] == temp || generateNum[1] == temp){
            temp = (int) (Math.random() * 9)+1;
        }
        return temp;
    }

}
