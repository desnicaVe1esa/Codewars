package reversed_strings.groovy

import org.junit.Test

class TestExample {
    @Test
    void "basic tests"() {
        assert Kata.reverse("world") == "dlrow"
        assert Kata.reverse("hello") == "olleh"
        assert Kata.reverse("") == ""
        assert Kata.reverse("h") == "h"
    }
}
