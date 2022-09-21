package game.baesball.view.input;

public class InputValidation {

    public boolean checkInputEmpty(String input) {
        if (input.length() == 0) return true;
        return false;
    }
}
