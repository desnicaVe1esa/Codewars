package kyu_6.multiplication_table.groovy;

import org.junit.Test

class ExampleTestSuite {
    @Test
    void "Example Tests"() {
        assert Kata.multiplicationTable(1) == [[1]]
        assert Kata.multiplicationTable(2) == [[1, 2], [2, 4]]
        assert Kata.multiplicationTable(3) == [[1, 2, 3], [2, 4, 6], [3, 6, 9]]
    }
}