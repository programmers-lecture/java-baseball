package game.baseball.view.input;

public class InputHandler {

    private final static InputView inputView = new InputView();
    private final static InputValidation inputValidation = new InputValidation();

    public static String readLine() {
        String input = "";
        input = inputView.read();

        if (inputValidation.checkInputEmpty(input)) {
            input = inputView.read().trim();
        }

        return input;
    }

    public static String[] splitBySpace(String input) {
        return input.split(" ");
    }

    public static int[] convertToIntegerArray(String[] input) {
        return new int[] {
                Integer.parseInt(input[0]),
                Integer.parseInt(input[1]),
                Integer.parseInt(input[2])
        };
    }
}
