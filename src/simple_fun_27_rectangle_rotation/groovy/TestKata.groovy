package simple_fun_27_rectangle_rotation.groovy

import org.junit.Test

class TestKata {
    @Test
    void basicTests() {
        assert Kata.rectangleRotation(6, 4) == 23
        assert Kata.rectangleRotation(30, 2) == 65
        assert Kata.rectangleRotation(8, 6) == 49
        assert Kata.rectangleRotation(16, 20) == 333
    }
}
