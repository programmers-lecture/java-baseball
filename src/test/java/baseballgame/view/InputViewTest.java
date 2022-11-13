package baseballgame.view;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InputViewTest {
    private static final String NOT_DIGIT_EXCEPTION_MESSAGE = "오류: 입력한 값이 숫자가 아닙니다.";
    private static final String NOT_VALID_SIZE_EXCEPTION_MESSAGE = "오류: 3개의 숫자만 입력야합니다.";

    private final InputView inputView = new InputView();

    @Test
    void Should_ThrowException_ForInvalidInput() {
        // given
        String inputNumber = "NOT DIGIT";

        // when
        try {
            inputView.checkValidInput(inputNumber);
        }

        // then
        catch (Exception e) {
            System.out.println(e.getMessage());
            assertThat(e.getMessage()).isEqualTo(NOT_DIGIT_EXCEPTION_MESSAGE);
        }
    }
}