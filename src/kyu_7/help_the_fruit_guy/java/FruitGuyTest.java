package kyu_7.help_the_fruit_guy.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
public class FruitGuyTest {
    @Test
    public void testEmptyFruit() {
        assertTrue(FruitGuy.removeRotten(new String[0]).length == 0);
    }

    @Test
    public void testAllRottenArray() {
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
        String [] expected = new String []{"apple","banana","apple","pineapple","kiwi"};
        assertArrayEquals(expected, FruitGuy.removeRotten(rotten));
    }
}

