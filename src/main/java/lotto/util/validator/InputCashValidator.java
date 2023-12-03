package lotto.util.validator;

public class InputCashValidator implements NumericValidator {
    public void validate(String request) {
        validateNumeric(request);
    }
}
