package kyu_7.sum_of_odd_numbers.groovy

import org.junit.Test

class TestKata {
    @Test
    void basicTests() {
        assert Kata.rowSumOddNumbers(1) == 1
        assert Kata.rowSumOddNumbers(2) == 8
        assert Kata.rowSumOddNumbers(13) == 2197
        assert Kata.rowSumOddNumbers(19) == 6859
        assert Kata.rowSumOddNumbers(41) == 68921
        assert Kata.rowSumOddNumbers(42) == 74088
        assert Kata.rowSumOddNumbers(74) == 405224
        assert Kata.rowSumOddNumbers(86) == 636056
        assert Kata.rowSumOddNumbers(93) == 804357
        assert Kata.rowSumOddNumbers(101) == 1030301
    }
}
