package kyu_7.complete_the_pattern_1.java;

public class Pattern1{
    public static String pattern(int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(String.valueOf(i).repeat(i)).append("\n");
        }
        return stringBuilder.toString().trim();
    }
}
