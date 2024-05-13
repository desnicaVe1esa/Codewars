package kyu_8.expressions_matter.groovy

import org.junit.Test

class TestKata {
    @Test
    void basicTests() {
        assert Kata.expressionMatter(2, 1, 2) == 6
        assert Kata.expressionMatter(2, 1, 1) == 4
        assert Kata.expressionMatter(1, 1, 1) == 3
        assert Kata.expressionMatter(1, 2, 3) == 9
        assert Kata.expressionMatter(1, 3, 1) == 5
        assert Kata.expressionMatter(2, 2, 2) == 8
        assert Kata.expressionMatter(5, 1, 3) == 20
        assert Kata.expressionMatter(3, 5, 7) == 105
        assert Kata.expressionMatter(5, 6, 1) == 35
        assert Kata.expressionMatter(1, 6, 1) == 8
        assert Kata.expressionMatter(2, 6, 1) == 14
        assert Kata.expressionMatter(6, 7, 1) == 48
        assert Kata.expressionMatter(2, 10, 3) == 60
        assert Kata.expressionMatter(1, 8, 3) == 27
        assert Kata.expressionMatter(9, 7, 2) == 126
        assert Kata.expressionMatter(1, 1, 10) == 20
        assert Kata.expressionMatter(9, 1, 1) == 18
        assert Kata.expressionMatter(10, 5, 6) == 300
        assert Kata.expressionMatter(1, 10, 1) == 12
    }
}