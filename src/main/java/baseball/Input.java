package baseball;

import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {
    public Input() {}
    private static Scanner scanner;

    public List<String> getUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        scanner = new Scanner(System.in);
        List<String> input = Arrays.asList(scanner.nextLine().split(""));
        if(input.size()!=3 || input.size() != input.stream().distinct().count()) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    public Boolean continuePlay() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        String input = scanner.nextLine();
        if(input.equals("1")) {
            return true;
        } else if(input.equals("2")) {
            return false;
        }

        System.out.println("1과 2중에서만 입력하세요.");
        throw new IllegalArgumentException();
    }
}
