package Domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private static final char ZERO_CHAR = '0';

  public Balls createPlayerBalls(String inputValue){
    List<Ball> playerBalls = new ArrayList<>();
    for(int i=0; i<inputValue.length(); i++){
      playerBalls.add(new Ball(inputValue.charAt(i)-ZERO_CHAR));
    }
    return new Balls(playerBalls);
  }
}
