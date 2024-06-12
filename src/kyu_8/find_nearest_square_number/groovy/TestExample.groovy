package kyu_8.find_nearest_square_number.groovy;

import org.junit.Test

class TestExample {
    @Test
    void "Basic Test"() {
        assert Kata.nearestSq(1) == 1
        assert Kata.nearestSq(2) == 1
        assert Kata.nearestSq(10) == 9
        assert Kata.nearestSq(111) == 121
        assert Kata.nearestSq(9999) == 10000
    }
}