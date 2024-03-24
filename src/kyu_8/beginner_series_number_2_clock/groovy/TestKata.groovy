package kyu_8.beginner_series_number_2_clock.groovy

import org.junit.Test

class TestKata {
    @Test
    void basicTests() {
        assert Kata.past(0, 1, 1) == 61000
        assert Kata.past(1, 1, 1) == 3661000
        assert Kata.past(0, 0, 0) == 0
        assert Kata.past(1, 0, 1) == 3601000
        assert Kata.past(1, 0, 0) == 3600000
    }
}