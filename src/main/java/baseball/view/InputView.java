package baseball.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class InputView {

    private static final BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(System.in));

    public static List<String> inputNumberToList() throws IOException {
        return List.of(bufferedReader.readLine().split(""));
    }


}
