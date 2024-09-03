package kyu_8.exclamation_marks_series_4_remove_all_exclamation_marks_from_sentence_but_ensure_a_exclamation_mark_at_the_end_of_string.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test void sampleTests() {
        assertEquals("Hi!", Kata.remove("Hi!"), "For input \"Hi!\"");
        assertEquals("Hi!", Kata.remove("Hi!!!"), "For input \"Hi!!!\"");
        assertEquals("Hi!", Kata.remove("!Hi"), "For input \"!Hi\"");
        assertEquals("Hi!", Kata.remove("!Hi!"), "For input \"!Hi!\"");
        assertEquals("Hi Hi!", Kata.remove("Hi! Hi!"), "For input \"Hi! Hi!\"");
        assertEquals("Hi!", Kata.remove("Hi"), "For input \"Hi\"");
    }
}
