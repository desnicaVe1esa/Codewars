package disemvowel_trolls.java;

public class Troll {
    public static String disemvowel(String str) {
        str = str.replaceAll("[AEIOUaeiou]", "");
        return str;
    }
}
