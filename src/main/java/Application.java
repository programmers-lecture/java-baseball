import Controller.GameController;
import Domain.Computer;
import Domain.Player;
import View.InputView;
import View.OutputView;

public class Application {
  public static void main(String[] args) {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    Player player = new Player();
    Computer computer = new Computer();

    new GameController(inputView, computer, player, outputView).run();
  }
}
