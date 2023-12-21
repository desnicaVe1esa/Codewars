package sum_of_positive.groovy

import org.junit.Test

class TestExample {
    @Test
    void "works for some examples"() {
        assert Kata.positiveSum([1, 2, 3, 4, 5]) == 15
        assert Kata.positiveSum([1, -2, 3, 4, 5]) == 13
        assert Kata.positiveSum([-1, 2, 3, 4, -5]) == 9
    }

    @Test
    void "returns 0 when list is empty"() {
        assert Kata.positiveSum([]) == 0
    }

    @Test
    void "returns 0 when all elements are negative"() {
        assert Kata.positiveSum([-1, -2, -3, -4, -5]) == 0
    }
}
