package kyu_7.ordered_count_of_characters.groovy;

import org.junit.Test

class ExampleTests {
    @Test
    void "Example Tests" () {
        assert Kata.orderedCount('abracadabra') == [['a', 5], ['b', 2], ['r', 2], ['c', 1], ['d', 1]]
        assert Kata.orderedCount('Code Wars') == [['C', 1], ['o', 1], ['d', 1], ['e', 1], [' ', 1], ['W', 1], ['a', 1], ['r', 1], ['s', 1]]
    }
}
