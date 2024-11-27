package kyu_8.closest_elevator.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestElevator {
    @Test
    void exampleTests() {
        assertEquals("right", Elevator.call(0, 0, 0), "call(0, 0, 0)");
        assertEquals("left", Elevator.call(0, 1, 0), "call(0, 1, 0)");
        assertEquals("left", Elevator.call(0, 2, 0), "call(0, 2, 0)");
    }
}
