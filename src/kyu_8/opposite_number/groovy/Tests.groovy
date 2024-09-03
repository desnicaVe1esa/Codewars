package kyu_8.opposite_number.groovy

import org.junit.Test
class Tests {
    @Test
    void FixedTests() {
        assert Solution.opposite(-1) == 1
        assert Solution.opposite(14) == -14
        assert Solution.opposite(-34) == 34
    }
}
