package Controller;

import Domain.Balls;
import Domain.Computer;
import Domain.Hint;
import Domain.Player;
import View.InputView;
import View.OutputView;

public class GameController {
  InputView inputView;
  Computer computer;
  Player player;
  OutputView outputView;

  public GameController(InputView inputView, Computer computer, Player player, OutputView outputView) {
    this.inputView = inputView;
    this.outputView = outputView;
    this.computer = computer;
    this.player = player;
  }

  public void run(){
    playGame();
    restartGame();
  }

  private void playGame(){
    Balls computerNumbers = computer.createRandomBalls();
    while(true){
      Balls playerNumbers = player.createPlayerBalls(inputView.inputDisplay());
      Hint hint = computerNumbers.countStrikeAndBall(playerNumbers);
      if(hint.getStrike()==3){
        outputView.closeRightDisplay();
        break;
      }
      outputView.strikeAndBallDisplay(hint.getStrike(), hint.getBall());
    }
  }

  private void restartGame(){
    while(checkRestart()){
      playGame();
    }
  }

  private boolean checkRestart(){
    int replayValue = inputView.mainDisplay();
    if(replayValue==1){
      return true;
    }
    outputView.close();
    return false;
  }
}
