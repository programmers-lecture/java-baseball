package baseball;

import java.util.Scanner;

public class PlayGame {
    private String randomNumber = "";

    private int ball = 0;

    private int strike = 0;

    public PlayGame(int[] randomNumber) {
        for(int i = 0; i < randomNumber.length; i++){
            this.randomNumber += randomNumber[i];
        }
    }

    public void playGame(){
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals(randomNumber)){
            System.out.print("숫자를 입력해주세요 : ");
            input = scanner.nextLine();

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int intRandomNumber = randomNumber.charAt(i)-48;
                    int intInput = input.charAt(j)-48;

                    String  test = String.valueOf(intInput);

                    if(intRandomNumber == intInput){

                        if(i == j){
                            this.ball++;
                        } else {
                            this.strike++;
                        }
                    }
                }
            }

            if(ball > 0){
                System.out.println(ball + "볼");

            }

            if(strike > 0){
                System.out.println(strike + "스트라이크");

            }

            if(ball == 0 && strike == 0){
                System.out.println("낫싱");
            }
            ball = 0;
            strike = 0;

            if(input.equals(randomNumber)){
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                        "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            }
        }
    }
}