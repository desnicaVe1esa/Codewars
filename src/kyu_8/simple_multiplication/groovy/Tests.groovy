package kyu_8.simple_multiplication.groovy

import org.junit.Test
class Tests {
    @Test
    void FixedTests() {
        assert Solution.simpleMultiplication(2) == 16
        assert Solution.simpleMultiplication(1) == 9
        assert Solution.simpleMultiplication(8) == 64
        assert Solution.simpleMultiplication(4) == 32
        assert Solution.simpleMultiplication(5) == 45
    }
}
