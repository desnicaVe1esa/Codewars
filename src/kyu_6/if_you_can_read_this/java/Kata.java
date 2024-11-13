package kyu_6.if_you_can_read_this.java;

import java.util.HashMap;
import java.util.Map;

public class Kata {

    private static final Map<Character, String> rules = new HashMap<>();

    static {
        rules.put('A', "Alfa");
        rules.put('B', "Bravo");
        rules.put('C', "Charlie");
        rules.put('D', "Delta");
        rules.put('E', "Echo");
        rules.put('F', "Foxtrot");
        rules.put('G', "Golf");
        rules.put('H', "Hotel");
        rules.put('I', "India");
        rules.put('J', "Juliett");
        rules.put('K', "Kilo");
        rules.put('L', "Lima");
        rules.put('M', "Mike");
        rules.put('N', "November");
        rules.put('O', "Oscar");
        rules.put('P', "Papa");
        rules.put('Q', "Quebec");
        rules.put('R', "Romeo");
        rules.put('S', "Sierra");
        rules.put('T', "Tango");
        rules.put('U', "Uniform");
        rules.put('V', "Victor");
        rules.put('W', "Whiskey");
        rules.put('X', "Xray");
        rules.put('Y', "Yankee");
        rules.put('Z', "Zulu");
    }

    public static String toNATO (String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            result.append(rules.getOrDefault(string.toUpperCase().charAt(i), string.charAt(i) + "")).append(" ");
        }
        return result.toString().replaceAll("\\s+", " ").trim();
    }
}
