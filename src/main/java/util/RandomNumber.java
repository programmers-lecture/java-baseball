package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
  private static final int MAX_NUM = 9;
  public int createRandomNumber(){
    Random random = new Random();
    int number = random.nextInt(MAX_NUM)+1;
    return number;
  }

  public boolean validateDuplicateNumber(int number, List<Integer> randomNumbers){
    if(randomNumbers.contains(number)){
      return false;
    }
    return true;
  }

  public void addRandomNumber(int number, List<Integer> randomNumbers){
    if(validateDuplicateNumber(number,randomNumbers)){
      randomNumbers.add(number);
    }
  }

  public List<Integer> createRandomNumbers(){
    List<Integer> randomNumbers = new ArrayList<>();
    while(randomNumbers.size()<3){
      int number = createRandomNumber();
      addRandomNumber(number,randomNumbers);
    }
    return randomNumbers;
  }
}
