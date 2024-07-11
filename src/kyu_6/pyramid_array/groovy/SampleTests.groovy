package kyu_6.pyramid_array.groovy;

import org.junit.Test

class SampleTests {
    @Test
    void "Sample Tests" () {
        assert Kata.pyramid(0) == []
        assert Kata.pyramid(1) == [[1]]
        assert Kata.pyramid(2) == [[1], [1, 1]]
    }
}