package delete_occurrences_of_an_element_if_it_occurs_more_than_n_times.java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author Marko Bekhta
 */
public class EnoughIsEnoughTest {
    @Test
    public void deleteNth() throws Exception {
        assertArrayEquals(
                new int[] { 20, 37, 21 },
                EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                EnoughIsEnough.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )
        );
        assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                EnoughIsEnough.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                EnoughIsEnough.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        assertArrayEquals(
                new int[] { },
                EnoughIsEnough.deleteNth( new int[] { }, 5 )
        );
    }
}