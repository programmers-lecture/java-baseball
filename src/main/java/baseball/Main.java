package baseball;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomNumber random = new RandomNumber();
        int[] randomNumber = random.random();

        System.out.println(Arrays.toString(randomNumber));

        PlayGame playGame = new PlayGame(randomNumber);
        playGame.playGame();
    }
}