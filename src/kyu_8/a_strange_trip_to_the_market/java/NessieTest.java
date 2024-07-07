package kyu_8.a_strange_trip_to_the_market.java;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class NessieTest {
    @Test
    public void testBasicTrue() {
        String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
        System.out.println(n);
        assertTrue(Nessie.isLockNessMonster(n));
    }
    @Test
    public void testBasicFalse() {
        String n = "Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.";
        System.out.println(n);
        assertFalse(Nessie.isLockNessMonster(n));
    }
}