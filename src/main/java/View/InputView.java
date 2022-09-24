package View;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
  private Scanner sc;
  private final String inputMessage = "숫자를 입력해주세요: ";
  private final String mainMessage = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

  private final String ERROR_MESSAGE = "잘못된 입력입니다. 게임을 종료합니다";

  public InputView() {
    sc = new Scanner(System.in);
  }

  public String inputDisplay(){
    System.out.print(inputMessage);
    String inputValue = sc.next();
    validation(inputValue);
    return inputValue;
  }

  private void validation(String inputValue) {
    validateNull(inputValue);
    validateNumbers(inputValue);
  }

  private void validateNull(String inputValue){
    if(inputValue==null){
      throw new IllegalArgumentException(ERROR_MESSAGE);
    }
  }

  private void validateNumbers(String inputValue){
    String[] splitInputValue = inputValue.split("");
    for(int i=0; i<splitInputValue.length; i++){
      char number = splitInputValue[i].charAt(0);
      validateNum(number);
    }
  }

  private void validateNum(char number) {
    if(!Character.isDigit(number)){
      throw new IllegalArgumentException(ERROR_MESSAGE);
    }
  }

  public int mainDisplay(){
    System.out.println(mainMessage);
    int replayValue = sc.nextInt();
    return replayValue;
  }
}
