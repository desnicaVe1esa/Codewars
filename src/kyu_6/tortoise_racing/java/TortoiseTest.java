package kyu_6.tortoise_racing.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class TortoiseTest {

    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertArrayEquals(new int[]{0, 32, 18}, Tortoise.race(720, 850, 70));
        assertArrayEquals(new int[]{3, 21, 49}, Tortoise.race(80, 91, 37));
        assertArrayEquals(new int[]{2, 0, 0}, Tortoise.race(80, 100, 40));
        assertArrayEquals(new int[]{18, 20, 0}, Tortoise.race(820, 850, 550));
        assertArrayEquals(new int[]{3, 21, 49}, Tortoise.race(80, 91, 37));
    }
}

