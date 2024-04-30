package kyu_8.convert_a_boolean_to_a_string.groovy

import org.junit.Test

class TestKata {
    @Test
    void SampleTests() {
        assert Kata.booleanToString(true) == "true"
        assert Kata.booleanToString(false) == "false"
    }
}
