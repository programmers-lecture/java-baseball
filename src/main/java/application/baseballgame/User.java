package application.baseballgame;

import application.input.Input;

public class User extends Player{
    @Override
    public void setNumbers() {
        Input input = new Input();
        this.numbers = input.userNumbers();
    }
}
