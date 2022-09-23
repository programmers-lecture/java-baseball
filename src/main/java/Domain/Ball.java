package Domain;

public class Ball {

  private final String RANGE_EXCEPTION = "숫자 범위안에 있지 않습니다";
  private final String NOT_NUMBER_EXCEPTION = "문자가 올수 없습니다";
  private final int MIN_NUMBER = 1;
  private final int MAX_NUMBER = 9;

  private final int number;

  private Ball(int number) {
    validation(number);
    this.number = number;
  }

  public static Ball of(int number){
    return new Ball(number);
  }

  private void validation(int number){
    validateRange(number);
  }


  private void validateRange(int number) {
    if(MIN_NUMBER>number && number>MAX_NUMBER){
      throw new IllegalArgumentException("RANGE_EXCEPTION");
    }
  }

}
