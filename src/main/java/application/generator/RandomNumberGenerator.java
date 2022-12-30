package application.generator;

import application.constant.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public List<Integer> generate() {
        List<Integer> randomNumberList = new ArrayList<>();
        while(randomNumberList.size() < Config.BASEBALL_GAME_SIZE) {
            Random random = new Random();
            int randomNumber = random.nextInt(9) + 1;
            if(!randomNumberList.contains(randomNumber)) {
                randomNumberList.add(randomNumber);
            }
        }
        return randomNumberList;
    }
}
