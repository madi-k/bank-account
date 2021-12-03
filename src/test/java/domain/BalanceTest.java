package domain;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class BalanceTest {

    @Test
    public void should_new_balance_have_zero_value_when_created() {
        Balance balance = new Balance(BigDecimal.ZERO);

        assertEquals(BigDecimal.ZERO, balance.getValue());
    }

    @Test
    public void should_new_balance_have_ten_value_when_created() {
        Balance balance = new Balance(BigDecimal.TEN);

        assertEquals(BigDecimal.TEN, balance.getValue());
    }


}