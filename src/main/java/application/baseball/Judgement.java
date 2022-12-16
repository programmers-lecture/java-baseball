package application.baseball;

import java.util.List;
import java.util.stream.Collectors;

public class Judgement {
    private int getTotalCount(List<Integer> computer, List<Integer> inputNumber) {
        return inputNumber.stream()
                .filter(number -> computer.contains(number))
                .collect(Collectors.toList())
                .size();
    }
    public int getStrikeCount(List<Integer> computer, List<Integer> inputNumber) {
        int count = 0;
        for(int i = 0; i < inputNumber.size(); i++) {
            if(computer.get(i) == inputNumber.get(i)) {
                count += 1;
            }
        }
        return count;
    }
    public int getBallCount(List<Integer> computer, List<Integer> inputNumber) {
        return getTotalCount(computer,inputNumber) - getStrikeCount(computer, inputNumber);
    }
}
