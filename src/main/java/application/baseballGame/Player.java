package application.baseballGame;

import java.util.List;

public abstract class Player {
    List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }
    public abstract void setNumbers();
}
