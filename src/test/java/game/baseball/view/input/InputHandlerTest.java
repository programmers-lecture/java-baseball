package game.baseball.view.input;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;

import java.util.Arrays;

import static game.baseball.message.ExceptionMessage.INPUT_FORMAT_ERROR;
import static game.baseball.view.input.InputHandler.convertToIntegerList;
import static game.baseball.view.input.InputHandler.splitEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class InputHandlerTest {

    @DisplayName("사용자 입력값 배열 테스트")
    @ParameterizedTest
    @CsvSource({
            "123, '[1, 2, 3]'",
            "234, '[2, 3, 4]'",
            "345, '[3, 4, 5]'"
    })
    void split_Each_Test(String userInputForm, String expectedResult) {
        assertEquals(expectedResult, Arrays.toString(splitEach(userInputForm)));
    }

    @DisplayName("사용자 입력값 정구표현식 배열 자동 수정 테스트")
    @ParameterizedTest
    @CsvSource({
            "!@#123, '[1, 2, 3]'",
            "123$@, '[1, 2, 3]'",
            "A!)J123KF, '[1, 2, 3]'",
            "!123l, '[1, 2, 3]'",
            "1k23k, '[1, 2, 3]'",
            "1b2bbgdsfsdfds3!@#!@#!@a, '[1, 2, 3]'",
            "123a, '[1, 2, 3]'",
            "12a3, '[1, 2, 3]'"
    })
    void not_Matched_Input_Form_Auto_Fix_Test(String userInputForm, String expectedResult) {
        assertEquals(expectedResult, convertToIntegerList(splitEach(userInputForm)).toString());
    }

    @DisplayName("사용자 입력 사이즈 예외 처리 테스트")
    @ParameterizedTest
    @EmptySource()
    void split_Each_Condition_With_BallSize_IllegalArgumentException_Test(String userInputForm) {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> splitEach(userInputForm)
        );

        assertEquals(
                INPUT_FORMAT_ERROR.getErrorMessage(),
                exception.getMessage()
        );
    }

    @DisplayName("사용자 입력 리스트 변환 테스트")
    @ParameterizedTest
    @CsvSource({
            "123, '[1, 2, 3]'",
            "234, '[2, 3, 4]'",
            "345, '[3, 4, 5]'"
    })
    void split_Each_And_Convert_To_Integer_List_Test(String userInputForm, String expectedResult) {
        assertEquals(
                expectedResult,
                convertToIntegerList(splitEach(userInputForm)).toString()
        );
    }

    @DisplayName("사용자 입력 리스트 변환 예외 처리 테스트")
    @ParameterizedTest
    @EmptySource()
    void convert_To_Integer_List_IllegalArgumentException_Test(String userInputForm) {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> convertToIntegerList(splitEach(userInputForm))
        );

        assertEquals(
                INPUT_FORMAT_ERROR.getErrorMessage(),
                exception.getMessage()
        );
    }

}