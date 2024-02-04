package kyu_8.is_n_divisible_by_x_and_y.groovy

import org.junit.Test

class TestKata {
    @Test
    void "Basic tests"() {
        assert Kata.isDivisible(3, 3, 4) == false
        assert Kata.isDivisible(12, 3, 4) == true
        assert Kata.isDivisible(8, 3, 4) == false
        assert Kata.isDivisible(48, 3, 4) == true
        assert Kata.isDivisible(100, 5, 10) == true
        assert Kata.isDivisible(100, 5, 3) == false
        assert Kata.isDivisible(4, 4, 2) == true
        assert Kata.isDivisible(5, 2, 3) == false
        assert Kata.isDivisible(17, 17, 17) == true
        assert Kata.isDivisible(17, 1, 17) == true
    }
}
