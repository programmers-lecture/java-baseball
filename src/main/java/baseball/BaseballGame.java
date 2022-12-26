package baseball;

public class BaseballGame {
    public final static int NUMBER_SIZE = 3;
    private Computer computer;
    private View view;
    private Judgement judgement;
    private String playerNumbers;
    private int ball = 0;
    private int strike = 0;

    BaseballGame() {
        this.computer = new Computer();
        this.view = new View();
        this.judgement = new Judgement();
    }

    public String play() {
        while (strike != NUMBER_SIZE) {
            playerNumbers = view.getNumbers();
            ball = judgement.countBall(playerNumbers, computer.getComputerNumbers());
            strike = judgement.countStrike(playerNumbers, computer.getComputerNumbers());
            view.printResult(ball, strike);
        }
        return view.gameEnd();
    }
}
