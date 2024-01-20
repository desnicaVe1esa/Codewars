package kyu_6.bit_counting.groovy

import org.junit.Test

class SampleTests {
    @Test
    void "Sample Tests" () {
        assert Kata.countBits(0) == 0
        assert Kata.countBits(4) == 1
        assert Kata.countBits(7) == 3
        assert Kata.countBits(9) == 2
        assert Kata.countBits(10) == 2
        assert Kata.countBits(26) == 3
    }
}
