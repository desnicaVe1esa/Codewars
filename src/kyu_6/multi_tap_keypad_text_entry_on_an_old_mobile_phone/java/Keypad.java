package kyu_6.multi_tap_keypad_text_entry_on_an_old_mobile_phone.java;

import java.util.HashMap;
import java.util.Map;

public class Keypad {
    private static final Map<Character, Integer> keyboard = new HashMap<>();
    static {
        keyboard.put('1', 1);

        keyboard.put('A', 1);
        keyboard.put('B', 2);
        keyboard.put('C', 3);
        keyboard.put('2', 4);

        keyboard.put('D', 1);
        keyboard.put('E', 2);
        keyboard.put('F', 3);
        keyboard.put('3', 4);

        keyboard.put('G', 1);
        keyboard.put('H', 2);
        keyboard.put('I', 3);
        keyboard.put('4', 4);

        keyboard.put('J', 1);
        keyboard.put('K', 2);
        keyboard.put('L', 3);
        keyboard.put('5', 4);

        keyboard.put('M', 1);
        keyboard.put('N', 2);
        keyboard.put('O', 3);
        keyboard.put('6', 4);

        keyboard.put('P', 1);
        keyboard.put('Q', 2);
        keyboard.put('R', 3);
        keyboard.put('S', 4);
        keyboard.put('7', 5);

        keyboard.put('T', 1);
        keyboard.put('U', 2);
        keyboard.put('V', 3);
        keyboard.put('8', 4);

        keyboard.put('W', 1);
        keyboard.put('X', 2);
        keyboard.put('Y', 3);
        keyboard.put('Z', 4);
        keyboard.put('9', 5);

        keyboard.put('*', 1);

        keyboard.put(' ', 1);
        keyboard.put('0', 2);

        keyboard.put('#', 1);
    }

    public static int presses(String phrase) {
        int result = 0;
        for (int i = 0; i < phrase.length(); i++) {
            result += keyboard.get(phrase.toUpperCase().charAt(i));
        }
        return result;
    }
}
