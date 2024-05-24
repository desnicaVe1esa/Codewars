package kyu_6.sieve_of_eratosthenes.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testPrime0() {
        // assertEquals("expected", "actual");
        assertEquals(0,Primes.primes(0).size());
    }
    @Test
    public void testPrime1(){
        assertEquals(0,Primes.primes(1).size());
    }


    @Test
    public void testPime3(){
        assertEquals(Arrays.asList(2,3),Primes.primes(3));
    }

    @Test
    public void testPime6(){
        assertEquals(Arrays.asList(2,3,5),Primes.primes(6));
    }

    @Test
    public void testPime7(){
        assertEquals(Arrays.asList(2,3,5,7),Primes.primes(7));
    }

    @Test
    public void testPime11(){
        assertEquals(Arrays.asList(2,3,5,7,11),Primes.primes(11));
    }

    @Test
    public void testPime120(){
        assertEquals(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113),
                Primes.primes(120));
    }



}