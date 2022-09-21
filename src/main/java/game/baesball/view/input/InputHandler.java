package game.baesball.view.input;

public class InputHandler {

    private final static InputView inputView = new InputView();
    private final static InputValidation inputValidation = new InputValidation();

    public static String readLine() {
        String input = "";
        input = inputView.read();

        if (inputValidation.checkInputEmpty(input)) {
            // TODO : 다시 읽기
            input = inputView.read();
        }

        return input;
    }

    public static String[] splitBySpace(String input) {
        return input.split(" ");
    }

    public static Integer[] convertToIntegerArray(String[] input) {
        return new Integer[] {
                Integer.parseInt(input[0]),
                Integer.parseInt(input[0]),
                Integer.parseInt(input[0])
        };
    }
}
