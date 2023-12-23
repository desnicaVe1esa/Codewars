package convert_a_string_to_a_number.groovy

import org.junit.Test

class SampleTests {
    @Test
    void "Sample Tests" () {
        assert Kata.stringToNumber("1234") == 1234
        assert Kata.stringToNumber("605") == 605
        assert Kata.stringToNumber("1405") == 1405
        assert Kata.stringToNumber("1234") == 1234
    }
}
