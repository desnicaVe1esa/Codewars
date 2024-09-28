package kyu_7.the_old_switcheroo.java;

public class Kata {
    public static String vowel2Index(String s) {
        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i) + "")) {
                result.append(i + 1);
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
