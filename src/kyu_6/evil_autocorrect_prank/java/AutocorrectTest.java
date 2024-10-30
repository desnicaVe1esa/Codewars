package kyu_6.evil_autocorrect_prank.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutocorrectTest {
    @Test
    public void testApply() {
        String[] inputs = new String[] {
                "u",
                "you",
                "Youuuuu",
                "youtube",
                "I miss you!"
        };

        String[] outputs = new String[] {
                "your sister",
                "your sister",
                "your sister",
                "youtube",
                "I miss your sister!"
        };

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(String.format("Wrong result for \"%s\":", inputs[i]), outputs[i], Kata.autocorrect(inputs[i]));
        }
    }
}