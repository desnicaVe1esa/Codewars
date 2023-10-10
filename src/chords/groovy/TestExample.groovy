package chords.groovy

import org.junit.Test

class TestExample {
    @Test
    void "Basic Tests"() {
        assert Kata.chords("C") == [["C","E","G"],["C","D#","G"]]
        assert Kata.chords("F") == [["F","A","C"],["F","G#","C"]]
        assert Kata.chords("G") == [["G","B","D"],["G","A#","D"]]
    }
}
