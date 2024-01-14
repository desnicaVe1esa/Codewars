package kyu_8.beginner_reduce_but_grow.groovy

import org.junit.Test

class ExampleTests {
    @Test
    void "Example Tests"() {
        assert Kata.grow([5, 4, 1, 3, 9]) ==  540
        assert Kata.grow([-2, 6, 7, 8]) ==  -672
        assert Kata.grow([10]) ==  10
        assert Kata.grow([0, 2, 9, 7]) == 0
    }
}
