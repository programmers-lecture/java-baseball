package application.baseballgame.player;

import application.input.Input;

public class User extends Player {
    public void setNumbers() {
        Input input = new Input();
        this.numbers = input.userNumbers();
    }
}
