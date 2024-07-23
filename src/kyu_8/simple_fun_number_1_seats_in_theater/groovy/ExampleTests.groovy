package kyu_8.simple_fun_number_1_seats_in_theater.groovy;

import org.junit.Test

class ExampleTests {
    @Test
    void "Exampl Tests"() {
        assert Kata.seatsInTheater(16,11,5,3) == 96
        assert Kata.seatsInTheater(1,1,1,1) == 0
        assert Kata.seatsInTheater(13,6,8,3) == 18
        assert Kata.seatsInTheater(60,100,60,1) == 99
        assert Kata.seatsInTheater(1000,1000,1000,1000) == 0
    }
}