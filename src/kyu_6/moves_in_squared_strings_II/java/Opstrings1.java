package kyu_6.moves_in_squared_strings_II.java;

import java.util.function.Function;

class Opstrings1 {

    public static String rot(String strng) {
        StringBuilder sb = new StringBuilder(strng);
        return sb.reverse().toString();
    }
    public static String selfieAndRot(String strng) {
        int numberOfDots = strng.indexOf("\n");
        StringBuilder dots = new StringBuilder();
        dots.append(".".repeat(Math.max(0, numberOfDots)));
        String addedDots = strng.replaceAll("\n", dots+"\n");
        addedDots += dots;
        return addedDots + "\n" + rot(addedDots);
    }
    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
