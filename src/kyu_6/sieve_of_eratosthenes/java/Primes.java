package kyu_6.sieve_of_eratosthenes.java;

import java.util.List;

import static java.math.BigInteger.valueOf;
import static java.util.stream.IntStream.iterate;

public class Primes {
    static public List<Integer> primes(Integer x){
//        List<Integer> results = new ArrayList<Integer>();
//        if (x <= 1) {
//            return results;
//        }
//        results.add(2);
//        for (int i = 2; i <= x; i++) {
//            if (i % 2 != 0 && Math.sqrt(i) % 1 != 0) {
//                results.add(i);
//            }
//        }
//        return results;

        return iterate(2, i -> i <= x, i -> i + 1).filter(i -> valueOf(i).isProbablePrime(10)).boxed().toList();
    }
}