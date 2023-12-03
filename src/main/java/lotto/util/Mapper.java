package lotto.util;

import lotto.dto.BuyCashDto;
import lotto.util.validator.InputCashValidator;

public class Mapper {
    public static BuyCashDto toBuyCashDto(String request) {
        new InputCashValidator().validate(request);

        return new BuyCashDto(toLong(request));
    }

    private static long toLong(String request) {
        return Long.parseLong(request);
    }
}
