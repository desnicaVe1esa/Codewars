package kyu_7.alphabetical_addition.groovy;

import org.junit.Test

class TestExample {
    @Test
    void "Basic tests"() {
        assert Kata.addLetters(['a', 'b', 'c']) == 'f'
        assert Kata.addLetters(['z']) == 'z'
        assert Kata.addLetters(['a', 'b']) == 'c'
        assert Kata.addLetters(['c']) == 'c'
        assert Kata.addLetters(['z', 'a']) == 'a'
        assert Kata.addLetters(['y', 'c', 'b']) == 'd'
        assert Kata.addLetters([]) == 'z'
    }
}