package kyu_7.odd_even_string_sort.groovy


import org.junit.jupiter.api.Test

class ExampleTests {
    @Test
    void "Example Tests"() {
        assert Kata.sortMyString("CodeWars") == "CdWr oeas"
        assert Kata.sortMyString("YCOLUE'VREER") == "YOU'RE CLEVER"
    }
}