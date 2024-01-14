package kyu_8.reversed_strings.java;

public class Kata {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        return sb.toString();
    }
}