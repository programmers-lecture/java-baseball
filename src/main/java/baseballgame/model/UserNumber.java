package baseballgame.model;

import java.util.ArrayList;

public class UserNumber {
    private final ArrayList<Integer> userNumber;

    public UserNumber(ArrayList<Integer> userNumber) {
        this.userNumber = userNumber;
    }

    public ArrayList<Integer> getUserNumber() {
        return userNumber;
    }
}
