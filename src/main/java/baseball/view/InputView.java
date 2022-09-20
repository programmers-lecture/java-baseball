package baseball.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputView {

    private final BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(System.in));


    public List<Integer> inputNumbersToList() {
        return Arrays.stream(numberValidation(inputLine()).split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }

    private String inputLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("입력에 실패했습니다.");
        }
    }

    private String numberValidation(String numbers) {
        if (Pattern.matches("^\\d{3}", numbers)) {
            return numbers;
        }
        throw new IllegalArgumentException("입력이 잘못되었습니다.");
    }


}
