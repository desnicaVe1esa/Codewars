package kyu_6.find_the_odd_int.groovy

import org.junit.Test

class SampleTests {
    @Test
    void "Sample Tests" () {
        assert Kata.findIt([20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5]) == 5
        assert Kata.findIt([1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5]) == -1
        assert Kata.findIt([20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5]) == 5
        assert Kata.findIt([10]) == 10
        assert Kata.findIt([1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1]) == 10
    }
}
