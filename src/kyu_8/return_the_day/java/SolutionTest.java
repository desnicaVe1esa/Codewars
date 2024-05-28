package kyu_8.return_the_day.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testSomething() {
        assertEquals("Sunday",DayOfWeek.getDay(1));
        assertEquals("Monday",DayOfWeek.getDay(2));
        assertEquals("Tuesday",DayOfWeek.getDay(3));
        assertEquals("Wrong, please enter a number between 1 and 7",DayOfWeek.getDay(8));
        assertEquals("Wrong, please enter a number between 1 and 7",DayOfWeek.getDay(20));
    }
}
