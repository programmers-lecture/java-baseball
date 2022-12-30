package application.view;

import java.util.*;


public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public int getRetry() {
        String code = scanner.next();
        if(!code.matches("[1-2]+")) {
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(code);
    }

    // [refactor] 책임 분리 - input -> player -> game
    public String[] getNumber() {
        return scanner.next().split("");
    }

}
