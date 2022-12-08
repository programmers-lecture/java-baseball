package application;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Game {
    private int player;
    private List<Integer> computer;
    // 0: 시작 전 1: 정답 2: 오답
    private int isCorrect;
    // 0: 시작 전 1: 게임가능 2: 게임종료
    private int isPlay;
    static Scanner scanner = new Scanner(System.in);

    public Game() {
        this.isCorrect = 0;
        this.isPlay = 0;
    }
    public void play() {
        while(isPlay != 2) {
            init();
        }

    }
    private void init() {
        this.computer = ThreadLocalRandom.current().ints(1, 9).distinct()
                .limit(3).boxed().collect(Collectors.toList());

        for(int num : computer) {
            System.out.println(num);
        }
        this.isPlay = 1;
    }

}
