package kyu_8.all_star_code_challenge_18.java;

public class CodeWars {
    public static int strCount(String str, char letter) {
        int result = 0;
        for (char c : str.toCharArray()) {
            if (letter == c) {
                result++;
            }
        }
        return result;
    }
}
