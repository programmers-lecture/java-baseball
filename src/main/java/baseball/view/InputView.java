package baseball.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class InputView {

    private final BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(System.in));


    public List<String> inputNumbersToList() {
        return List.of(toList(inputLine()));
    }

    private String[] toList(String numbers) {
        return numbers.split("");
    }

    private String inputLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("입력에 실패했습니다.");
        }
    }


}
