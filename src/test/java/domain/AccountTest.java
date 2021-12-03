package domain;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void should_new_account_have_balance_of_zero_when_created_with_balance_of_zero() {
        Balance expectedBalance = new Balance(BigDecimal.ZERO);
        Account account = new Account(new Balance(BigDecimal.ZERO));

        assertEquals(expectedBalance.getValue(), account.currentBalance().getValue());
    }

    @Test
    public void should_new_account_have_balance_of_ten_when_created_with_balance_of_ten() {
        Balance expectedBalance = new Balance(BigDecimal.TEN);
        Account account = new Account(new Balance(BigDecimal.TEN));

        assertEquals(expectedBalance.getValue(), account.currentBalance().getValue());
    }

}