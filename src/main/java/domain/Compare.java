package domain;

import java.util.*;

public class Compare {

    private int strikeCount;
    private int ballCount;

    public int countStrike(List<Integer> userNum, List<Integer> randomValue) {

        strikeCount = 0;

        for(int i=0; i<3; i++) {
            if(userNum.get(i) == randomValue.get(i)) strikeCount++;
        }
        return strikeCount;
    }

    public int countBall(List<Integer> userNum, List<Integer> randomValue) {

        ballCount = 0;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if((i!=j) & (userNum.get(j) == randomValue.get(i))) ballCount++;
            }
        }

        return ballCount;
    }
}
