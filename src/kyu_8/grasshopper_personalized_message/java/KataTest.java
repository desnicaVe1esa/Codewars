package kyu_8.grasshopper_personalized_message.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Kata.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Kata.greet("Greg", "Daniel"));
    }
}