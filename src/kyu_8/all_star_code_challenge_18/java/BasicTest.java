package kyu_8.all_star_code_challenge_18.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasicTest {

    @Test
    public void testSomething() {
        assertEquals(1, CodeWars.strCount("Hello", 'o'));
        assertEquals(2, CodeWars.strCount("Hello", 'l'));
        assertEquals(0, CodeWars.strCount("", 'z'));
    }
}
