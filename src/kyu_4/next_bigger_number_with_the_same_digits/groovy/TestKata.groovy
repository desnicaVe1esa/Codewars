package kyu_4.next_bigger_number_with_the_same_digits.groovy

import org.junit.Test

class TestKata {
    @Test
    void basicTests() {
        assert Kata.nextBigger(12) == 21
        assert Kata.nextBigger(513) == 531
        assert Kata.nextBigger(2017) == 2071
        assert Kata.nextBigger(414) == 441
        assert Kata.nextBigger(144) == 414
        assert Kata.nextBigger(123456789) == 123456798
        assert Kata.nextBigger(1234567890) == 1234567908
        assert Kata.nextBigger(9876543210) == -1
        assert Kata.nextBigger(9999999999) == -1
        assert Kata.nextBigger(59884848459853) == 59884848483559
    }
}

