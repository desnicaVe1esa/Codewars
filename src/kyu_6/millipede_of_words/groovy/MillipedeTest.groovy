package kyu_6.millipede_of_words.groovy

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MillipedeTest {
    @Test
    void descriptionTrue() {
        def message = ["excavate", "endure", "desire", "screen", "theater", "excess", "night"];
        assertEquals(true, Millipede.check(message), String.join(", ", message));
    }
    @Test
    void descriptionFalse() {
        def message = ["trade", "pole", "view", "grave", "ladder", "mushroom", "president"];
        assertEquals(false, Millipede.check(message), String.join(", ", message));
    }
    @Test
    void oneLetterWords() {
        def message = ["east", "e", "e", "t", "t", "e", "time"];
        assertEquals(true, Millipede.check(message), String.join(", ", message));
    }
    @Test
    void notGoodBoy() {
        def message = ["no", "dog", "on", "good"];
        assertEquals(false, Millipede.check(message), String.join(", ", message));
    }
}