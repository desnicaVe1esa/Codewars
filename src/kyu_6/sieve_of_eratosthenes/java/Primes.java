package kyu_6.sieve_of_eratosthenes.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Primes {
    static public List<Integer> primes(Integer x){
/*      1 вариант (прокатил :-))
        List<Integer> results = new ArrayList<Integer>();
        if (x <= 1) {
            return results;
        }
        results.add(2);
        for (int i = 2; i <= x; i++) {
            if (i % 2 != 0 && Math.sqrt(i) % 1 != 0) {
                results.add(i);
            }
        }
        return results;

        2 вариант
        return iterate(2, i -> i <= x, i -> i + 1).filter(i -> valueOf(i).isProbablePrime(10)).boxed().toList();

        3 вариант                                                                                                     */
        List<Integer> results = new ArrayList<Integer>();
        boolean[] numbers = new boolean[x + 1];
        Arrays.fill(numbers, true);
        for(int i = 2; i < numbers.length; i++) {
            if(numbers[i]) {
                results.add(i);
            }
            for(int j = 2 * i; j < numbers.length; j += i) {
                numbers[j] = false;
            }
        }
        return results;
    }
}