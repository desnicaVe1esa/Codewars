package kyu_7.v_a_p_o_r_c_o_d_e.groovy

import org.junit.Test
class SolutionTest {
    @Test
    void fixedTests() {
        assert Solution.vaporcode("Lets go to the movies") == "L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S";
        assert Solution.vaporcode("Why isnt my code working") == "W  H  Y  I  S  N  T  M  Y  C  O  D  E  W  O  R  K  I  N  G";
    }
}
