package Domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {
  private static final int BALLS_SIZE = 3;
  private final String SIZE_EXCEPTION = "자리수는 세자리수가 되어야합니다";
  private final String VALIDATE_EXCEPTION = "중복된 수가 있습니다";
  private final List<Ball> balls;

  public Balls(List<Ball> balls){
    validation(balls);
    this.balls = balls;
  }

  private void validation(List<Ball> balls) {
    validateSize(balls);
    validateDuplicateNumber(balls);
  }

  private void validateSize(List<Ball> balls){
    if (balls.size() != BALLS_SIZE){
      throw new IllegalArgumentException(SIZE_EXCEPTION);
    }
  }

  private void validateDuplicateNumber(List<Ball> balls){
    Set<Ball> ballsSet = new HashSet<>(balls);
    if(ballsSet.size()!=BALLS_SIZE){
      throw new IllegalArgumentException(VALIDATE_EXCEPTION);
    }
  }

  public Hint countStrikeAndBall(Balls playerNumbers){
    int strike = 0;
    int ball = 0;
    for(int i=0; i<BALLS_SIZE; i++){
      strike += countStrike(playerNumbers,i);
      ball += countBall(playerNumbers,i);
    }
    return new Hint(strike, ball);
  }

  private int countStrike(Balls playerNumbers, int index) {
    List<Ball> compareNumbers = playerNumbers.getBalls();
    Ball ball = balls.get(index);

    if (ball.equals(compareNumbers.get(index))){
      return 1;
    }
    return 0;
  }

  private int countBall(Balls playerNumbers, int index) {
    List<Ball> compareNumbers = playerNumbers.getBalls();
    Ball ball = balls.get(index);
    if (compareNumbers.contains(ball) && !ball.equals(compareNumbers.get(index))){
      return 1;
    }
    return 0;
  }

  public List<Ball> getBalls(){
    return balls;
  }
}
