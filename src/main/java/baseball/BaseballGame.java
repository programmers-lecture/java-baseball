package baseball;

public class BaseballGame {
    private Computer computer;
    private View view;
    private Judgement judgement;
    private String playerNumbers;
    private int ball;
    private int strike;

    BaseballGame() {
        this.computer = new Computer();
        this.view = new View();
        this.judgement = new Judgement();
        this.ball = 0;
        this.strike = 0;
    }

    public String play() {
        while (strike != Constant.NUMBER_SIZE) {
            playerNumbers = view.getNumbers();
            ball = judgement.countBall(playerNumbers, computer.getComputerNumbers());
            strike = judgement.countStrike(playerNumbers, computer.getComputerNumbers());
            view.printResult(ball, strike);
        }
        return view.gameEnd();
    }
}
