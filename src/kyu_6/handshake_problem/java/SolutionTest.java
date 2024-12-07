package kyu_6.handshake_problem.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void sampleTests() {
//        assertEquals(0, Kata.GetParticipants(0), "0 handshakes");
        assertEquals(2, Kata.GetParticipants(1), "1 handshake");
        assertEquals(3, Kata.GetParticipants(3), "3 handshakes");
        assertEquals(4, Kata.GetParticipants(6), "6 handshakes");
        assertEquals(5, Kata.GetParticipants(7), "7 handshakes");
    }
}
