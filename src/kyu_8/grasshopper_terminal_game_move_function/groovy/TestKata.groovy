package kyu_8.grasshopper_terminal_game_move_function.groovy

import org.junit.Test

class TestKata {
    @Test
    void basicTests() {
        assert Kata.move(0, 4) == 8
        assert Kata.move(3, 6) == 15
        assert Kata.move(2, 5) == 12
    }
}
