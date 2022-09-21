package baseball.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer implements User {
    private List<Integer> ball = new ArrayList<>();

    public Computer() {
        Random random = new Random();
        while(ball.size() < 3) {
            int randomNumber = random.nextInt(9) + 1;
            if(!ball.contains(randomNumber))
                ball.add(randomNumber);
        }
    }

    @Override
    public List<Integer> getBall() {
        return ball;
    }
}
