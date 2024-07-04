package kyu_7.sort_the_gift_code.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftSorterTest {
    @Test
    public void Tests1() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("sort fedcba", "abcdef", gs.sortGiftCode("fedcba"));
    }

    @Test
    public void Tests2() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("reverse alphabet", "abcdefghijklmnopqrstuvwxyz", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
}