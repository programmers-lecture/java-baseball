package baseball;

import java.util.List;

public class Baseball {
    private final int len;

    public Baseball(int len) {
        this.len = len;
    }

    public void play() {
        Input input = new Input();
        Output output = new Output();
        RandomNumber randomNumber = new RandomNumber();
        Strike strike;
        Ball ball;

        do {
            System.out.println("숫자 야구 게임을 시작합니다.");

            List<String> computer = randomNumber.generate();
            List<String> user = input.getUserNumber();

            strike = new Strike(len);
            ball = new Ball(len);

            int strikeCount = strike.count(computer, user);
            int ballCount = ball.count(computer, user);

            while (true) {
                Boolean result = output.result(strikeCount, ballCount);
                // 정답
                if (result) {
                    break;
                }
                user = input.getUserNumber();
                strikeCount = strike.count(computer, user);
                ballCount = ball.count(computer, user);
            }

            // 게임 종료
        } while (input.continuePlay());
    }
}
