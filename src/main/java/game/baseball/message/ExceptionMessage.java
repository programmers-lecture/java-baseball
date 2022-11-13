package game.baseball.message;

public enum ExceptionMessage {
    RANDOM_NUMBER_GENERATOR_ERROR("올바르지 않은 랜덤 오류 입니다."),
    INPUT_FORMAT_ERROR("올바르지 않은 포맷입니다."),
    INCORRECT_BALL_SIZE("입력된 공의 개수가 올바르지 않습니다.");

    private final String errorMessage;

    ExceptionMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
