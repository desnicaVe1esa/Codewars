package kyu_6.html_complementary_color.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HTMLComplementaryColorTest {
    @Test
    public void emptyStringEqualTo000000() {
        assertEquals("#FFFFFF", HTMLComplementaryColor.getReversedColor(""));
    }
    @Test
    public void resultShouldBeginsWithHashChar() {
        assertEquals('#', HTMLComplementaryColor.getReversedColor("0").charAt(0));
    }
    @Test(expected=IllegalArgumentException.class)
    public void incorrectHexStringLength() {
        HTMLComplementaryColor.getReversedColor("1234567");
    }
    @Test(expected=IllegalArgumentException.class)
    public void invalidCharacterInHexColorShouldThrowError() {
        HTMLComplementaryColor.getReversedColor("AA00ZZ");
    }
    @Test(expected=IllegalArgumentException.class)
    public void hashCharInHexColorShouldThrowError() {
        HTMLComplementaryColor.getReversedColor("#AAFFAA");
    }
}