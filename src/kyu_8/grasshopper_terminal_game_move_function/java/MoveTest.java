package kyu_8.grasshopper_terminal_game_move_function.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoveTest {
    @Test
    public void basicTests() {
        assertEquals(8, Move.move(0, 4));
        assertEquals(15, Move.move(3, 6));
        assertEquals(12, Move.move(2, 5));
    }
}
