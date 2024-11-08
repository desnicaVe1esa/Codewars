package kyu_6.airport_arrivals_departures_2.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ExamplesTest {

    @Test
    public void exampleFlapRotors() throws Exception {
        // CAT => DOG
        String[] before = Preloaded.prepare( new String[] { "CAT" } );
        String[] after = Preloaded.prepare( new String[] { "DOG" } );
        int[][] rotors = { { 1, 13, 27 } };
        assertArrayEquals( rotors, Dinglemouse.flapRotors( before, after ) );
    }

    @Test
    public void basicFlapRotors() throws Exception {
        // HELLO => WORLD!
        String[] before = Preloaded.prepare( new String[] { "HELLO " } );
        String[] after = Preloaded.prepare( new String[] { "WORLD!" } );
        int[][] rotors = { { 15, 49, 50, 48, 43, 13 } };
        assertArrayEquals( rotors, Dinglemouse.flapRotors( before, after ) );

        // CODE => WARS
        before = Preloaded.prepare( new String[] { "CODE" } );
        after = Preloaded.prepare( new String[] { "WARS" } );
        rotors = new int[][] { { 20, 20, 28, 0 } };
        assertArrayEquals( rotors, Dinglemouse.flapRotors( before, after ) );
    }

}

