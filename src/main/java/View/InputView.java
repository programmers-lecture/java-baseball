package View;

import java.util.Scanner;

public class InputView {
  private Scanner sc;
  private static final char ZERO_CHAR = '0';
  private final String inputMessage = "숫자를 입력해주세요: ";
  private final String mainMessage = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
  private final String ERROR_MESSAGE = "잘못된 입력입니다. 게임을 종료합니다";

  private final String MENU_RANGE_EXCEPTION = "해당 메뉴를 찾을 수 없습니다";

  public InputView() {
    sc = new Scanner(System.in);
  }

  public String inputDisplay(){
    System.out.print(inputMessage);
    String inputValue = sc.next();
    validation(inputValue);
    return inputValue;
  }

  public int mainDisplay(){
    System.out.println(mainMessage);
    String replayValue = sc.next();
    validation(replayValue);
    validateMenuRange(replayValue);
    return replayValue.charAt(0)-ZERO_CHAR;
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

  private void validateMenuRange(String replayValue){
    int menu = replayValue.charAt(0)-ZERO_CHAR;
    if(!(menu == 1 || menu == 2)){
      throw new IllegalArgumentException(MENU_RANGE_EXCEPTION);
    }
  }
}
