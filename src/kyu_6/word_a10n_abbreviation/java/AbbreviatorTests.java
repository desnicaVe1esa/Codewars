package kyu_6.word_a10n_abbreviation.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbbreviatorTests {

    private Abbreviator abbr = new Abbreviator();

    @Test
    public void testInternationalization() {
        assertEquals("i18n", abbr.abbreviate("internationalization"));
        assertEquals("e6t-r3s are r4y fun!", abbr.abbreviate("elephant-rides are really fun!"));
        assertEquals("b5n; d4e-b6d-s2s-mat", abbr.abbreviate("balloon; double-barreled-sits-mat"));
        assertEquals("You n2d, n2d not w2t, to c6e t2s c2e-w2s m5n", abbr.abbreviate("You need, need not want, to complete this code-wars mission"));
        assertEquals("on, on. on the: m8c_sat, d3y: d3y, on", abbr.abbreviate("on, on. on the: monolithic_sat, doggy: doggy, on"));
        assertEquals("a: cat'cat; is5is, cat: d4e-b6d-the", abbr.abbreviate("a: cat'cat; is5is, cat: double-barreled-the"));
    }

}
