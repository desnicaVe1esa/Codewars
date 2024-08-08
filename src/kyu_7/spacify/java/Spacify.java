package kyu_7.spacify.java;

public class Spacify {
    public static String spacify(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append(" ");
        }
        return result.toString().trim();
    }
}