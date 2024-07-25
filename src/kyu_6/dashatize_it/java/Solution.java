package kyu_6.dashatize_it.java;


public class Solution {
    public static String dashatize(int num) {
        StringBuilder result = new StringBuilder();
        String nums = String.valueOf(num).charAt(0) == '-' ? String.valueOf(num).substring(1)
                : String.valueOf(num);
        for (int i = 0; i < nums.length(); i++) {
            if ((nums.charAt(i) - '0') % 2 == 0) {
                result.append(nums.charAt(i));
                if (i < nums.length() - 1 && nums.charAt(i + 1) % 2 != 0) {
                    result.append("-");
                }
            } else {
                result.append(nums.charAt(i)).append("-");
            }
        }
        return result.toString().charAt(result.length() - 1) == '-' ? result.substring(0, result.length() - 1)
                : result.toString();
    }
}