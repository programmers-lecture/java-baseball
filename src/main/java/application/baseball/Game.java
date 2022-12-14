package application.baseball;

import application.constant.Message;

import java.util.List;

public class Game {
    private Computer computer;
    private Integer gameStatus; // 0: 게임시작전 1: 게임중 2: 게임종료
    private Input input;
    private Judgement judgement;
    public Game() {
        this.computer = new Computer();
        this.gameStatus = 0;
        this.input = new Input();
        this.judgement = new Judgement();
    }

    private void init() {
        // 컴퓨터의 3자리 수인 1-9사이 각각 다른 임의의 수 3개를 생성한다.
        computer.createAnswerWithRandom();
        this.gameStatus = 0;
    }

    public void play() {
        init();
        System.out.println("컴퓨터: " + computer.getAnswer().toString());
        while(gameStatus != 2) {
            List<Integer> player = input.getNumber();
            System.out.println(player);

            int strike = judgement.getStrikeCount(computer.getAnswer(), player);
            int ball = judgement.getBallCount(computer.getAnswer(), player);

            String status = Message.getStatus(ball, strike);
            System.out.println(status);

            if(status == Message.getThreeStrike()) {
                if(retry() == true) {
                    init();
                } else {
                    gameStatus = 2;
                }
            }


        }
    }

    private boolean retry() {
        if(input.getRetry() == 1) {
            return true;
        }
        return false;
    }



}
