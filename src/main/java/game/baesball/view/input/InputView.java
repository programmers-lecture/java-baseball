package game.baesball.view.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String read() {
        String input = "";
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

}
