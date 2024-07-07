package kyu_6.validate_credit_card_number.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreditcardValidationTest{
    @Test
    public void test891(){
        assertEquals(false, Validate.validate("891"));
    }
}