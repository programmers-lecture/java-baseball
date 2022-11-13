package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
  private static final int MAX_NUM = 9;
  private static final int BALLS_SIZE = 3;

  public Balls createRandomBalls(){
    List<Ball> randomNumbers = new ArrayList<>();
    while(randomNumbers.size()<BALLS_SIZE) {
      int number = createRandomNumber();
      addRandomNumber(number, randomNumbers);
    }
    return new Balls(randomNumbers);
  }

  public int createRandomNumber(){
    Random random = new Random();
    int number = random.nextInt(MAX_NUM)+1;
    return number;
  }

  public boolean validateDuplicateNumber(Ball ball, List<Ball> randomNumbers){
    if(randomNumbers.contains(ball)){
      return false;
    }
    return true;
  }

  public void addRandomNumber(int number, List<Ball> randomNumbers){
    Ball ball = new Ball(number);
    if(validateDuplicateNumber(ball,randomNumbers)){
      randomNumbers.add(ball);
    }
  }
}
