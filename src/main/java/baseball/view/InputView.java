package baseball.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputView {

    public static final String INPUT_ERROR_MSG = "입력이 잘못되었습니다.";
    private final BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));

    public List<Integer> inputNumbersToList() {
        return Arrays.stream(sss().split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public String inputLine() {
        try {
            return bufferedReader.readLine().trim();
        } catch (IOException e) {
            throw new RuntimeException(INPUT_ERROR_MSG);
        }
    }

    private boolean numberValidation(String numbers) {
        return Pattern.matches("^\\d{3}", numbers);
    }

    private String sss() {
        String numbers;
        do {
            OutputView.printRequestNumberMSG();
            numbers = inputLine();
        } while (!numberValidation(numbers));
        return numbers;
    }

    public int inputToInt() {
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(INPUT_ERROR_MSG);
        }
    }

}
