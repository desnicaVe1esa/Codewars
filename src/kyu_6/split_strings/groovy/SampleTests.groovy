package kyu_6.split_strings.groovy


import org.junit.jupiter.api.Test

class SampleTests {
    @Test
    void "Sample Tests"() {
        assert Kata.solution("asdfadsf") == ["as", "df", "ad", "sf"]
        assert Kata.solution("asdfads") == ["as", "df", "ad", "s_"]
        assert Kata.solution("") == []
        assert Kata.solution("x") == ["x_"]
    }
}
