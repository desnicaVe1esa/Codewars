package kyu_6.mexican_wave.groovy

import org.junit.Test

class TestWave {
    @Test
    void basicTests() {
        assert Kata.wave("a       b    ") == ["A       b    ", "a       B    "]
        assert Kata.wave("this is a few words") == ["This is a few words", "tHis is a few words", "thIs is a few words", "thiS is a few words", "this Is a few words", "this iS a few words", "this is A few words", "this is a Few words", "this is a fEw words", "this is a feW words", "this is a few Words", "this is a few wOrds", "this is a few woRds", "this is a few worDs", "this is a few wordS"]
        assert Kata.wave("") == []
        assert Kata.wave(" gap ") == [" Gap ", " gAp ", " gaP "]
    }
}
