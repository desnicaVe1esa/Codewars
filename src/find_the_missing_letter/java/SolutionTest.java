package find_the_missing_letter.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
