package kyu_8.are_you_playing_banjo.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BanjoExampleTest {
    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
        assertEquals( "Nope! Remember lower case counts, too!", "rolf plays banjo", Banjo.areYouPlayingBanjo("rolf"));
        assertEquals( "Nope!", "bravo does not play banjo", Banjo.areYouPlayingBanjo("bravo"));
    }
}