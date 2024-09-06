package kyu_6.valid_phone_number.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhoneExampleTests {
    @Test
    public void tests() {
        assertEquals(true, Kata.validPhoneNumber("(123) 456-7890"));
        assertEquals(false, Kata.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, Kata.validPhoneNumber("(098) 123 4567"));
    }
}
