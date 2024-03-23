package kyu_5.number_of_trailing_zeros_of_n.groovy

import org.junit.Test

class ExampleTests {
    @Test
    void "Example Tests"() {
        assert Kata.zeros(0) == 0
        assert Kata.zeros(6) == 1
        assert Kata.zeros(14) == 2
    }
}