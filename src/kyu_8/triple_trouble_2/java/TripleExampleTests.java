package kyu_8.triple_trouble_2.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TripleExampleTests {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", Kata.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", Kata.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", Kata.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", Kata.tripleTrouble("LLh","euo","xtr"));
    }
}