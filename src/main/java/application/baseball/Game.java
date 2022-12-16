package application.baseball;

import application.constant.Message;
import application.view.Output;

import java.util.List;

public class Game {
    private final Computer computer;
    private final Input input;
    private final Judgement judgement;
    private final Output output;
    private Integer gameStatus;
    public Game() {
        this.computer = new Computer();
        this.input = new Input();
        this.judgement = new Judgement();
        this.output = new Output();
    }

    private void init() {
        // 컴퓨터의 3자리 수인 1-9사이 각각 다른 임의의 수 3개를 생성한다.
        computer.createAnswerWithRandom();
        this.gameStatus = GameStatus.PREPARING.getCode();
    }

    public void play() {
        init();
        while(!gameStatus.equals(GameStatus.END.getCode())) {
            output.printNewLine("컴퓨터: " + computer.getAnswer().toString());

            output.printNowLine(Message.getInputNumberToPlay());
            List<Integer> player = input.getNumber();
            output.printNewLine("유저: " + player);

            int strike = judgement.getStrikeCount(computer.getAnswer(), player);
            int ball = judgement.getBallCount(computer.getAnswer(), player);

            String status = Message.getStatus(ball, strike);
            output.printNewLine(status);

            if(status == Message.getThreeStrike()) {
                if(retry() == true) {
                    init();
                } else {
                    gameStatus = GameStatus.END.getCode();
                }
            }

        }
    }

    private boolean retry() {
        output.printNewLine(Message.getRetry());

        if(input.getRetry() == 1) {
            return true;
        }
        return false;
    }
}
