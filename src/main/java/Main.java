import game.Game;
import numberBaseball.IntegerParser;
import numberBaseball.Parser;
import numberBaseball.ResultPrinter;
import numberBaseball.Setting;
import random.RandomGenerator;
import random.RandomIntegerGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RandomGenerator<Integer> randomGenerator = new RandomIntegerGenerator();
        Parser<Integer> parser = new IntegerParser();
        Game<Integer> game = new Game<>(randomGenerator);
        ResultPrinter printer = new ResultPrinter(Setting.MAX_NUMBER_OF_ELEMENTS);

        while(true){
            printer.printStartMessage();
            String input = sc.next();
            boolean result = printer.print(game.tryNew(parser.parse(input)));
            if(result){
                input = sc.next();
                if("2".equals(input)) break;
                if("1".equals(input)) {
                    game = new Game<>(randomGenerator);
                    continue;
                }
                throw new IllegalArgumentException();
            }
        }
    }
}
