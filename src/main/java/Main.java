import baseball.Baseball;
import game.Game;
import game.IntegerParser;
import game.Parser;
import random.RandomIntegerGenerator;

public class Main {
    public static void main(String[] args) {
        Parser<Integer> parser = new IntegerParser();

        while(true){
            Game<Integer> game = new Game<>(parser,
                    new Baseball<>(new RandomIntegerGenerator()));
            boolean isEnd = game.startAndGetIsEnd();
            if(isEnd){
                break;
            }
        }
    }
}
