package kyu_6.millipede_of_words.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MillipedeTest {
    @Test
    void descriptionTrue() {
        String[] message = new String[]{"excavate", "endure", "desire", "screen", "theater", "excess", "night"};
        assertEquals(true, Millipede.check(message), String.join(", ", message));
    }
    @Test
    void descriptionFalse() {
        String[] message = new String[]{"trade", "pole", "view", "grave", "ladder", "mushroom", "president"};
        assertEquals(false, Millipede.check(message), String.join(", ", message));
    }
}
