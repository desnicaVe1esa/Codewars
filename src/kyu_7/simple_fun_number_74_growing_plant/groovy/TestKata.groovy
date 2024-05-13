package kyu_7.simple_fun_number_74_growing_plant.groovy;

import org.junit.Test

class TestKata {
    @Test
    void basicTests() {
        assert Kata.growingPlant(100, 10, 910) == 10
        assert Kata.growingPlant(10, 9, 4) == 1
        assert Kata.growingPlant(5, 2, 5) == 1
        assert Kata.growingPlant(5, 2, 6) == 2
    }
}