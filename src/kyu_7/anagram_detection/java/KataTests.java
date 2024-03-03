package kyu_7.anagram_detection.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTests {
    @Test
    public void exampleTests() {
        Kata k = new Kata();
        assertEquals(true, k.isAnagram("foefet", "toffee"));
        assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, k.isAnagram("Twoo", "Woot"));
        assertEquals(false, k.isAnagram("apple", "pale"));
    }
}