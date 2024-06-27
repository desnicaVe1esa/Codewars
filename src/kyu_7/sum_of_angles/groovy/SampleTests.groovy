package kyu_7.sum_of_angles.groovy

import org.junit.Test

class SampleTests {
    @Test
    void "Sample Tests"() {
        assert Kata.angle(3) == 180
        assert Kata.angle(4) == 360
    }
}