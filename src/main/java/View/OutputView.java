package View;

import java.util.Scanner;

public class OutputView {
  private Scanner sc;
  private final String closedRightMessage = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

  public OutputView(){
    sc = new Scanner(System.in);
  }

  public void closeRightDisplay(){
    System.out.println(closedRightMessage);
  }

  public void strikeAndBallDisplay(int strike, int ball){
    if (strike==0 && ball==0){
      System.out.println("낫싱");
    }
    if (ball>0 && strike==0){
      System.out.println(ball+"볼");
    }
    if (ball==0 && strike>0){
      System.out.println(strike+"스트라이크");
    }
    if (ball>0 && strike>0) {
      System.out.println(ball + "볼 " + strike + "스트라이크");
    }
  }

  public void close(){
    sc.close();
  }
}
