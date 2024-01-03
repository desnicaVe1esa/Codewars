package binary_bunch_transform_of_an_integer.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryBunchTransformTest {

    @Test
    void testBunchSmallFixedValue() {
        assertEquals(28, BinaryBunchTransform.bunchIt(52), "Fixed test failed for 52");
        assertEquals(7, BinaryBunchTransform.bunchIt(19), "Fixed test failed for 19");
        assertEquals(56, BinaryBunchTransform.bunchIt(49), "Fixed test failed for 49");
    }

    @Test
    void testBunchPowerOfTwoFixedValue() {
        assertEquals(64, BinaryBunchTransform.bunchIt(64), "Fixed test failed for 64");
        assertEquals(128, BinaryBunchTransform.bunchIt(128), "Fixed test failed for 128");
        assertEquals(8192, BinaryBunchTransform.bunchIt(8192), "Fixed test failed for 8192");
        assertEquals(524288, BinaryBunchTransform.bunchIt(524288), "Fixed test failed for 524288");
        assertEquals(16777216, BinaryBunchTransform.bunchIt(16777216), "Fixed test failed for 16777216");
    }

    @Test
    void testBunchPowerOfTwoPlusOneFixedValue() {
        assertEquals(3, BinaryBunchTransform.bunchIt(65), "Fixed test failed for 65");
        assertEquals(3, BinaryBunchTransform.bunchIt(129), "Fixed test failed for 129");
        assertEquals(3, BinaryBunchTransform.bunchIt(8193), "Fixed test failed for 8193");
        assertEquals(3, BinaryBunchTransform.bunchIt(524289), "Fixed test failed for 524289");
        assertEquals(3, BinaryBunchTransform.bunchIt(16777217), "Fixed test failed for 16777217");
    }
}
