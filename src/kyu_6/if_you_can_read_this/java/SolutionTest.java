package kyu_6.if_you_can_read_this.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static void doTest(String input, String expected) {
        String actual = Kata.toNATO(input);
        assertEquals(expected, actual, "for string: <" + input + ">\n");
    }

    @Test
    void sampleTests() {
        doTest(
                "If you can read",
                "India Foxtrot Yankee Oscar Uniform Charlie Alfa November Romeo Echo Alfa Delta"
        );
        doTest(
                "Did not see that coming",
                "Delta India Delta November Oscar Tango Sierra Echo Echo Tango Hotel Alfa Tango Charlie Oscar Mike India November Golf"
        );
        doTest(
                "go for it!",
                "Golf Oscar Foxtrot Oscar Romeo India Tango !"
        );
        doTest(
                "the five boxing wizards jump quickly.",
                "Tango Hotel Echo Foxtrot India Victor Echo Bravo Oscar Xray India November Golf Whiskey India Zulu Alfa Romeo Delta Sierra Juliett Uniform Mike Papa Quebec Uniform India Charlie Kilo Lima Yankee ."
        );
        doTest(
                "PACK MY BOX WITH FIVE DOZEN LIQUOR JUGS?",
                "Papa Alfa Charlie Kilo Mike Yankee Bravo Oscar Xray Whiskey India Tango Hotel Foxtrot India Victor Echo Delta Oscar Zulu Echo November Lima India Quebec Uniform Oscar Romeo Juliett Uniform Golf Sierra ?"
        );
        doTest(
                "  p ? u . n  c t u  , a t i o n  ! ",
                "Papa ? Uniform . November Charlie Tango Uniform , Alfa Tango India Oscar November !"
        );
    }
}
