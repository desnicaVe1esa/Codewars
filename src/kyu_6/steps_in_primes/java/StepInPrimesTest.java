package kyu_6.steps_in_primes.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class StepInPrimesTest {

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(StepInPrimes.step(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(StepInPrimes.step(4,100,110)));
        assertEquals("[101, 107]", Arrays.toString(StepInPrimes.step(6,100,110)));
        assertEquals("[359, 367]", Arrays.toString(StepInPrimes.step(8,300,400)));
        assertEquals("[307, 317]", Arrays.toString(StepInPrimes.step(10,300,400)));
    }

}

