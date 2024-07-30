package kyu_7.switcheroo.groovy;

import org.junit.Test

class ExampleTests {
    @Test
    void "Exampl Tests"() {
        assert Kata.switcheroo("abc") == "bac"
        assert Kata.switcheroo('aaabcccbaaa') == 'bbbacccabbb'
        assert Kata.switcheroo('ccccc') == 'ccccc'
        assert Kata.switcheroo('abababababababab') == 'babababababababa'
        assert Kata.switcheroo('aaaaa') == 'bbbbb'
    }
}