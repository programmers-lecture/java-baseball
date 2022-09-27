package game.baseball.view.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static game.baseball.message.ExceptionMessage.INPUT_FORMAT_ERROR;

public class InputView {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String read() {
        String input = "";
        try {
            input = br.readLine();
            if (input.length() == 0) {
                throw new IOException();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(INPUT_FORMAT_ERROR.getErrorMessage());
        }
        return input;
    }

}
