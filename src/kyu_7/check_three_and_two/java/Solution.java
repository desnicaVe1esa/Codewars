package kyu_7.check_three_and_two.java;

public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {
        int a = 0, b = 0, c = 0;
        for (char aChar : chars) {
            if (aChar == 'a') {
                a++;
            }
            if (aChar == 'b') {
                b++;
            }
            if (aChar == 'c') {
                c++;
            }
        }
        return (a == 3 || b == 3 || c == 3) && (a == 2 || b == 2 || c == 2);
    }
}
