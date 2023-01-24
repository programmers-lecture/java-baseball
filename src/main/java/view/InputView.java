package view;

import java.util.Scanner;

public class InputView {
    public static String[] input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().split("");
    }
}
