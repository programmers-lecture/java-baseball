package Controller;


import java.util.List;
import Domain.Hint;
import Domain.HintService;
import View.InputView;
import View.OutputView;
import util.RandomNumber;

public class GameController {
  InputView inputView;
  RandomNumber randomNumber;
  HintService hintService;
  OutputView outputView;

  public GameController(InputView inputView, RandomNumber randomNumber, HintService hintService, OutputView outputView) {
    this.inputView = inputView;
    this.outputView = outputView;
    this.randomNumber = randomNumber;
    this.hintService = hintService;
  }

  public void run(){
    playGame();
    restartGame();
  }

  private void playGame(){
    List<Integer> computerNumbers = randomNumber.createRandomNumbers();
    while(true){
      List<Integer> playerNumbers = inputView.inputDisplay();
      Hint hint = hintService.countStrikeAndBall(playerNumbers, computerNumbers);
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
    return false;
  }
}
