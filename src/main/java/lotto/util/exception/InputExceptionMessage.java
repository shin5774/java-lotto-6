package lotto.util.exception;

public enum InputExceptionMessage {
    NOT_NUMERIC("숫자가 아닌 값이 입력되었습니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    InputExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
