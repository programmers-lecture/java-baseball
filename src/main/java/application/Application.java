package application;

import application.baseballgame.BaseballGame;
import application.baseballgame.UserChoice;
import application.input.Input;

public class Application {
    private static boolean stop = false;

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        Input input = new Input();
        while(!stop) {
            baseballGame.run();
            if(UserChoice.isStop(input.userChoice())) stop = true;
        }
    }
}