package kyu_8.i_love_you_a_little_a_lot_passionately_dot_dot_dot_not_at_all.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTests {
    @Test
    public void test1() {
        assertEquals("I love you", Sid.howMuchILoveYou(1));
        assertEquals("a little", Sid.howMuchILoveYou(2));
        assertEquals("not at all", Sid.howMuchILoveYou(6));
    }
}
