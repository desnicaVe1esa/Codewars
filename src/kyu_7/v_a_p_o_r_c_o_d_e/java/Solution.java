package kyu_7.v_a_p_o_r_c_o_d_e.java;

public class Solution {
    public static String vaporcode(String s) {
        return String.join("  ", s.toUpperCase().replaceAll(" ", "").split(""));
    }
}
