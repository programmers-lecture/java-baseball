import Controller.GameController;
import Domain.HintService;
import View.InputView;
import View.OutputView;
import util.RandomNumber;

public class Application {
  public static void main(String[] args) {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    HintService hintService = new HintService();
    RandomNumber randomNumber = new RandomNumber();

    new GameController(inputView, randomNumber, hintService, outputView).run();
  }
}
