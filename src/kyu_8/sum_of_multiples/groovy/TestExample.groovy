package kyu_8.sum_of_multiples.groovy;

import org.junit.Test
import static Kata.sumMul

class TestExample {
    @Test
    void "Basic tests"() {
        assert sumMul(0, 0) == 'INVALID'
        assert sumMul(2, 9) == 20
        assert sumMul(4, -7) == 'INVALID'
    }
}