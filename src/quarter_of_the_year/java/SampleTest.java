package quarter_of_the_year.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void exampleTests() {
        assertEquals(Kata.quarterOf(3), 1);
        assertEquals(Kata.quarterOf( 8), 3);
        assertEquals(Kata.quarterOf(11), 4);
    }
}
