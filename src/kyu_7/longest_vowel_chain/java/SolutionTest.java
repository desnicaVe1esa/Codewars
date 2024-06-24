package kyu_7.longest_vowel_chain.java;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(3, Solution.solve("ultrarevolutionariees"));
        assertEquals(2, Solution.solve("codewarriors"));
        assertEquals(3, Solution.solve("suoidea"));
        assertEquals(1, Solution.solve("strengthlessnesses"));
        assertEquals(11, Solution.solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
    }
}