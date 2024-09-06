package kyu_8.grasshopper_terminal_game_combat_function.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void sampleTest() {
        assertEquals(95, Game.combat(100,5), "For health = 100, damage = 5");
        assertEquals(84, Game.combat(92, 8), "For health = 92, damage = 8");
        assertEquals( 0, Game.combat(20,30), "For health = 20, damage = 30");
        assertEquals( 1, Game.combat(50,49), "For health = 50, damage = 49");
        assertEquals( 0, Game.combat(33,33), "For health = 33, damage = 33");
    }
}
