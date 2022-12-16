package application.baseball;

import java.util.List;
import java.util.Objects;

public class Judgement {
    private int getTotalCount(List<Integer> computer, List<Integer> inputNumber) {
        return (int) inputNumber.stream()
                .filter(computer::contains)
                .count();
    }
    public int getStrikeCount(List<Integer> computer, List<Integer> inputNumber) {
        int count = 0;
        for(int i = 0; i < inputNumber.size(); i++) {
            if(Objects.equals(computer.get(i), inputNumber.get(i))) {
                count += 1;
            }
        }
        return count;
    }
    public int getBallCount(List<Integer> computer, List<Integer> inputNumber) {
        return getTotalCount(computer,inputNumber) - getStrikeCount(computer, inputNumber);
    }
}
