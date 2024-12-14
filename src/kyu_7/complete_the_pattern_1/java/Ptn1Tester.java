package kyu_7.complete_the_pattern_1.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ptn1Tester {
    @Test void testFixedCases(){
        assertEquals(Pattern1.pattern(1), "1", "Pattern for n=1 doesn't match");
        assertEquals(Pattern1.pattern(2), "1\n22", "Pattern for n=2 doesn't match");
        assertEquals(Pattern1.pattern(5), "1\n22\n333\n4444\n55555", "Pattern for n=5 doesn't match");
        assertEquals(Pattern1.pattern(0), "", "Pattern for n=0 doesn't match");
        assertEquals(Pattern1.pattern(-25), "", "Pattern for n=-25 doesn't match");
    }

}
