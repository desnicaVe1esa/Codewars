package kyu_7.v_a_p_o_r_c_o_d_e.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



class SolutionTest {
    @Test
    void fixedTests() {
        assertEquals("L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S", Solution.vaporcode("Lets go to the movies"));
        assertEquals("W  H  Y  I  S  N  T  M  Y  C  O  D  E  W  O  R  K  I  N  G", Solution.vaporcode("Why isnt my code working"));
    }
}

