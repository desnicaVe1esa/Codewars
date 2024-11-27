package kyu_6.integer_depth.java;

public class MySolution {

    public int computeDepth(int n) {
        String digits = "";
        int result = 0;
        while (digits.length() < 10) {
            for (char c : Integer.toString(n * ++result).toCharArray()) {
                if (!digits.contains(Character.toString(c))) {
                    digits += c;
                }
            }
        }
        return result;
    }
}
