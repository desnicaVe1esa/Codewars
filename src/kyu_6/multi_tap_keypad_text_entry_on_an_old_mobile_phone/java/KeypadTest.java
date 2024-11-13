package kyu_6.multi_tap_keypad_text_entry_on_an_old_mobile_phone.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeypadTest {
    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
    }
}
