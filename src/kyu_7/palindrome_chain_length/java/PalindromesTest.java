package kyu_7.palindrome_chain_length.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromesTest {

    @Test
    public void testPalindrome() {
        assertEquals(0, Palindromes.palindromeChainLength(1));
        assertEquals(0, Palindromes.palindromeChainLength(88));
        assertEquals(0, Palindromes.palindromeChainLength(393));
    }

    @Test
    public void testNonPalindrome() {
        assertEquals(1, Palindromes.palindromeChainLength(10));
        assertEquals(1, Palindromes.palindromeChainLength(134));
        assertEquals(4, Palindromes.palindromeChainLength(87));
        assertEquals(7, Palindromes.palindromeChainLength(2897));
        assertEquals(24, Palindromes.palindromeChainLength(89));
    }

}
