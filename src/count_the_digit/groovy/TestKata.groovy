package count_the_digit.groovy

import org.junit.Test

class TestKata {
    @Test
    void basicTests() {
        assert Kata.nbDig(5750, 0) == 4700
        assert Kata.nbDig(11011, 2) == 9481
        assert Kata.nbDig(12224, 8) == 7733
        assert Kata.nbDig(11549, 1) == 11905
        assert Kata.nbDig(14550, 7) == 8014
        assert Kata.nbDig(8304, 7) == 3927
        assert Kata.nbDig(10576, 9) == 7860
        assert Kata.nbDig(12526, 1) == 13558
        assert Kata.nbDig(7856, 4) == 7132
        assert Kata.nbDig(14956, 1) == 17267
    }
}
