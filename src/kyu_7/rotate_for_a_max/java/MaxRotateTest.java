package kyu_7.rotate_for_a_max.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxRotateTest {

    @Test @DisplayName("Sample Tests maxRot")
    void testSample() {
        assertEquals(85821534, MaxRotate.maxRot(38458215), "For n = 38458215");
        assertEquals(988103115, MaxRotate.maxRot(195881031), "For n = 195881031");
        assertEquals(962193428, MaxRotate.maxRot(896219342), "For n = 896219342");
        assertEquals(94183076, MaxRotate.maxRot(69418307), "For n = 69418307");
    }
}