package number_of_n_element_permutations_with_k_inversions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExampleTests {

    @Test
    public void basicTests() {
        assertEquals(1, Kata.permuversion(0, 0));
        assertEquals(2,  Kata.permuversion(3, 1));
        assertEquals(4,  Kata.permuversion(5, 1));
        assertEquals(5,  Kata.permuversion(4, 2));
        assertEquals(14, Kata.permuversion(6, 2));
    }

    @Test
    public void zeroTests() {
        assertEquals(0,  Kata.permuversion(2, 2));
        assertEquals(0,  Kata.permuversion(3, 4));
    }
}

