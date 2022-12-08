package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Game {
    private List<Integer> player;
    private List<Integer> computer;
    // 0: 시작 전 1: 게임가능 2: 게임종료
    private int isPlay;
    static Scanner scanner = new Scanner(System.in);
    static String BALL = "볼";
    static String STRIKE = "스트라이크";

    public Game() {
        this.isPlay = 0;
    }
    public void play() {
        while(isPlay != 2) {
            init();
            setPlayer();

            if(findComputerByPlayer()) {
                isRetry();
            }
        }

    }
    private void init() {
        this.player = new ArrayList<>();
        this.computer = ThreadLocalRandom.current().ints(1, 9).distinct()
                .limit(3).boxed().collect(Collectors.toList());
        this.isPlay = 1;
    }

    private void setPlayer() {
        System.out.print("숫자를 입력해주세요: ");
        String input = scanner.next();
        if(input.length() != 3) {
            throw new IllegalArgumentException();
        }
        for(int i=0;i<3;i++){
            player.add(Integer.parseInt(String.valueOf(input.charAt(i))));
        }
    }

    private boolean findComputerByPlayer() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        return true;
    }

    private void isRetry() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int command = scanner.nextInt();
        if(command != 1 && command !=2) {
            throw new IllegalArgumentException();
        }
        if(command == 2) {
            isPlay = 2;
        }
    }

}
