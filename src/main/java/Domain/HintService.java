package Domain;

import java.util.List;

public class HintService {

  public Hint countStrikeAndBall(List<Integer> playerNumbers, List<Integer> computerNumbers){
    int strike = countStrike(playerNumbers,computerNumbers);
    int ball = countBall(playerNumbers,computerNumbers);
    return new Hint(strike,ball);
  }
  public int countStrike(List<Integer> playerNumbers, List<Integer> computerNumbers){
    int strike = 0;
    for(int i=0; i<3; i++){
      int playerNumber = playerNumbers.get(i);
      int computerNumber = computerNumbers.get(i);
      if(playerNumber==computerNumber){
        strike++;
      }
    }
    return strike;
  }

  public int countBall(List<Integer> playerNumbers, List<Integer> computerNumbers){
    int ball = 0;
    for(int i=0; i<3; i++){
      int playerNumber = playerNumbers.get(i);
      if(computerNumbers.contains(playerNumber)&&computerNumbers.indexOf(playerNumber)!=i){
        ball++;
      }
    }
    return ball;
  }

}
