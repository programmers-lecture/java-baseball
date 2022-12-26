package baseball;

public class Main {
    private static BaseballGame baseballGame;
    public static void main(String[] args) {
        String newGame = "1";
        while (newGame.equals("1")) {
            baseballGame = new BaseballGame();
            newGame = baseballGame.play();
        }
    }
}