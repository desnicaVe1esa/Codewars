package kyu_8.convert_boolean_values_to_strings_yes_or_no.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoolTest {
    @Test
    public void testBoolToWord() {
        Assert.assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}
