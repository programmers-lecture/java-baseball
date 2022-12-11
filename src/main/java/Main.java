import game.Baseball;
import numberBaseball.IntegerParser;
import numberBaseball.Parser;
import numberBaseball.ResultPrinter;
import random.RandomGenerator;
import random.RandomIntegerGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RandomGenerator<Integer> randomGenerator = new RandomIntegerGenerator();
        Parser<Integer> parser = new IntegerParser();
        Baseball<Integer> baseball = new Baseball<>(randomGenerator);
        ResultPrinter printer = new ResultPrinter();

        while(true){
            printer.printStartMessage();
            String input = sc.next();
            boolean result = printer.print(baseball.tryNew(parser.parse(input)));
            if(result){
                input = sc.next();
                if("2".equals(input)) break;
                if("1".equals(input)) {
                    baseball = new Baseball<>(randomGenerator);
                    continue;
                }
                throw new IllegalArgumentException();
            }
        }
    }
}
