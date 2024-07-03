package kyu_7.v_a_p_o_r_c_o_d_e.groovy

class Solution {
    static String vaporcode(String s) {
        String.join("  ", s.toUpperCase().replaceAll(" ", "").split(""))
    }
}
