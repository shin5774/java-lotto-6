package lotto.util;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidatorTest {

    @DisplayName("인자값이 숫자로만 이루어져 있는지 검증하는 기능")
    @ParameterizedTest
    @ValueSource(strings = {"abcs", "1a23", "aa1", " 111", "11 2", "   ", "-1"})
    void 숫자_검증_기능(String value) {
        assertThatThrownBy(() -> Validator.numberValidate(value))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
