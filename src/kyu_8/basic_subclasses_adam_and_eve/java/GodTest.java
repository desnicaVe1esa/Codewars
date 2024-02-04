package kyu_8.basic_subclasses_adam_and_eve.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GodTest {
    @Test
    public void makingAdam(){
        Human[] paradise = God.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }
}
