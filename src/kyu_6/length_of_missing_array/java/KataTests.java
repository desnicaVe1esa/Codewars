package kyu_6.length_of_missing_array.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTests {
        @Test
        public void BasicTests() {
//                assertEquals(3, Kata.getLengthOfMissingArray(new Object[][] { new Object[] { 1, 2 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }} ));
//                assertEquals(2, Kata.getLengthOfMissingArray(new Object[][] { new Object[] { 5, 2, 9 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }} ));
//                assertEquals(2, Kata.getLengthOfMissingArray(new Object[][] { new Object[] { null }, new Object[] { null, null, null } } ));
//                assertEquals(5, Kata.getLengthOfMissingArray(new Object[][] { new Object[] { 'a', 'a', 'a' }, new Object[] { 'a', 'a' }, new Object[] { 'a', 'a', 'a', 'a' }, new Object[] { 'a' }, new Object[] { 'a', 'a', 'a', 'a', 'a', 'a' }} ));
//
//                assertEquals(0, Kata.getLengthOfMissingArray(new Object[][] { }));
//                assertEquals(0, Kata.getLengthOfMissingArray(null));
                assertEquals(0, Kata.getLengthOfMissingArray(new Object[][] {new Object[] { 1, 2, 2 }, new Object[] { null }}));
        }
}