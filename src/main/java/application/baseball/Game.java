package application.baseball;

public class Game {
    private Computer computer;
    public Game() {
        this.computer = new Computer();
    }

    private void init() {
        // 컴퓨터의 3자리 수인 1-9사이 각각 다른 임의의 수 3개를 생성한다.
        computer.createAnswer();

    }

    public void play() {
        init();
    }

}
