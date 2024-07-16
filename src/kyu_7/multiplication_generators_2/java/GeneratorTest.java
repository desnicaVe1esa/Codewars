package kyu_7.multiplication_generators_2.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratorTest {

    @Test
    public void next() throws Exception {
        Generator gen = Generator.of( 1 );
        assertEquals( "1 x 1 = 1", "1 x 1 = 1", gen.next() );
        assertEquals( "1 x 2 = 2", "1 x 2 = 2", gen.next() );
        assertEquals( "1 x 3 = 3", "1 x 3 = 3", gen.next() );
        assertEquals( "1 x 4 = 4", "1 x 4 = 4", gen.next() );
        assertEquals( "1 x 5 = 5", "1 x 5 = 5", gen.next() );
    }

}
