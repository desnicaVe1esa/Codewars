package kyu_6.count_characters_in_your_string.groovy

import org.junit.Test

class ExampleTests {
    @Test
    void "Example Tests" () {
        assert Kata.count('aba') == ['a': 2, 'b': 1]
        assert Kata.count('') == [:]
    }
}