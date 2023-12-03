package lotto.util.validator;

import java.util.regex.Pattern;
import lotto.util.exception.InputException;
import lotto.util.exception.InputExceptionMessage;

public interface NumericValidator {
    Pattern NUMBER = Pattern.compile("[0-9]+");

    default void validateNumeric(String request) {
        if (isNotNumeric(request)) {
            throw InputException.of(InputExceptionMessage.NOT_NUMERIC.getMessage());
        }
    }

    private boolean isNotNumeric(String value) {
        return !NUMBER.matcher(value).matches();
    }
}
