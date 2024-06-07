package kyu_8.get_planet_name_by_id.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private void doTest(int id, String expected) {
        String actual = Planet.getPlanetName(id);
        assertEquals(expected, actual, "for id = " + id);
    }

    @Test
    void exampleTests() {
        doTest(2, "Venus");
        doTest(5, "Jupiter");
        doTest(3, "Earth");
    }
}
