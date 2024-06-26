package kyu_6.the_difference_between_11_and_21_in_ping_pong.java;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PingPongTest {
    @Test
    public void test() {
        ArrayList<Score> result = new ArrayList<>();
        result.add(new Score(11, 0));
        result.add(new Score(11, 0));
        result.add(new Score(1, 1));
        result.add(new Score(21, 0));
        result.add(new Score(2, 1));
        assertEquals(result, PingPong.result("WWWWWWWWWWWWWWWWWWWWWWLW"));
        result = new ArrayList<>();
        result.add(new Score(11, 0));
        result.add(new Score(0, 11));
        result.add(new Score(11, 11));
        assertEquals(result, PingPong.result("WWWWWWWWWWWLLLLLLLLLLL"));
        result = new ArrayList<>();
        result.add(new Score(9, 11));
        result.add(new Score(1, 0));
        result.add(new Score(10, 11));
        assertEquals(result, PingPong.result("WLWLLLWWWLWLWLLLWLWLW"));

    }
}