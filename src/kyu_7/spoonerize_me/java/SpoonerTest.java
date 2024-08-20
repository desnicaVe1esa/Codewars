package kyu_7.spoonerize_me.java;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpoonerTest {
    @Test
    public void basicTests() {
        Spooner spooner = new Spooner();
        assertEquals("pit nicking", spooner.spoonerize("nit picking"));
        assertEquals("bedding wells", spooner.spoonerize("wedding bells"));
        assertEquals("belly jeans", spooner.spoonerize("jelly beans"));
    }
}