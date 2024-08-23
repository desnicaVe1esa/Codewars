package kyu_8.string_cleaning.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCleaningTest {
    @Test void basicTests() {
        assertEquals("", StringCleaning.stringClean(""));
        assertEquals("! !", StringCleaning.stringClean("! !"));
        assertEquals("", StringCleaning.stringClean("123456789"));
        assertEquals("(Eat me!!)", StringCleaning.stringClean("(E3at m2e2!!)"));
        assertEquals("Dsa cdsc csa!!! I Am cool!", StringCleaning.stringClean("Dsa32 cdsc34232 csa!!! 1I 4Am cool!"));
        assertEquals("A A! AAA   JKL@!!!", StringCleaning.stringClean("A1 A1! AAA   3J4K5L@!!!"));
        assertEquals("Adgre Asad! AAA fvfdvJKL@", StringCleaning.stringClean("Adgre2321 A1sad! A2A3A4 fv3fdv3J544K5L@"));
        assertEquals("Addsadds A  $$sad! AAAe fKL@ ", StringCleaning.stringClean("Ad2dsad3ds21 A  1$$s122ad! A2A3Ae24 f44K5L@222222 "));
        assertEquals("Addsadds A  $$sa!d! A!A!Ae$ f## ", StringCleaning.stringClean("33333Ad2dsad3ds21 A3333  1$$s122a!d! A2!A!3Ae$24 f2##222 "));
        assertEquals("My \"messy\" data issues! Will they ever, ever be solved?", StringCleaning.stringClean("My \"me3ssy\" d8ata issues2! Will1 th4ey ever, e3ver be3 so0lved?"));
        assertEquals("Why can't we buy the good software? #cheapskates", StringCleaning.stringClean("Wh7y can't we3 bu1y the goo0d software3? #cheapskates3"));
    }
}