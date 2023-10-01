package moduli_number_system.groovy

import static org.junit.Assert.*;
import org.junit.Test;

public class FractsTest {

    private void testing(int n, int[] sys, String expect) {
        String actual = ModSystem.fromNb2Str(n, sys)
        assertEquals(expect, actual)
    }
    @Test
    public void basicTests() {
        testing(779, [8,7,5,3] as int[], "-3--2--4--2-")
        testing(15, [8,6,5,3] as int[], "Not applicable")
        testing(3450, [17,5,3] as int[], "Not applicable")

    }
}
