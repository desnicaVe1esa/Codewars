package kyu_8.cat_years_dog_years.groovy

import org.junit.Test

class TestExample {
    @Test
    void "Basic tests"() {
        assert Kata.humanYearsCatYearsDogYears(1)  == [1, 15, 15]
        assert Kata.humanYearsCatYearsDogYears(2)  == [2, 24, 24]
        assert Kata.humanYearsCatYearsDogYears(10) == [10, 56, 64]
    }
}
