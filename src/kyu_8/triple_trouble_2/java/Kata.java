package kyu_8.triple_trouble_2.java;

public class Kata {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            result.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return result.toString();
    }
}