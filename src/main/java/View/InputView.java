package View;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
  private Scanner sc;
  private final String inputMessage = "숫자를 입력해주세요: ";

  public InputView() {
    sc = new Scanner(System.in);
  }

  public List<Integer> inputDisplay(){
    System.out.println(inputMessage);
    String inputValue = sc.next();
    List<Integer> playerNumbers = Arrays
        .stream(inputValue.split(""))
        .map(s -> Integer.parseInt(s))
        .collect(Collectors.toList());
    return playerNumbers;
  }
}
