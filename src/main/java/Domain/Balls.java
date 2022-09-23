package Domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {
  private final int BALLS_SIZE = 3;
  private final String SIZE_EXCEPTION = "자리수는 세자리수가 되어야합니다";
  private final String VALIDATE_EXCEPTION = "중복된 수가 있습니다";
  private final List<Ball> balls;

  private Balls(List<Ball> balls){
    validation(balls);
    this.balls = balls;
  }

  private void validation(List<Ball> balls) {
    validateSize(balls);
    validateDuplicateNumber(balls);
  }

  private void validateSize(List<Ball> balls){
    if (balls.size() != BALLS_SIZE){
      throw new IllegalArgumentException();
    }
  }

  private void validateDuplicateNumber(List<Ball> balls){
    Set<Ball> ballsSet = new HashSet<>(balls);
    if(ballsSet.size()!=BALLS_SIZE){
      throw new IllegalArgumentException(VALIDATE_EXCEPTION);
    }
  }

  public static Balls of(String inputValue){
    List<Ball> balls = new ArrayList<>();
    for(int i=0; i<inputValue.length(); i++){
      balls.add(Ball.of(inputValue.charAt(i)));
    }
    return new Balls(balls);
  }

}
