package kyu_5.factorial_decomposition.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class FactDecomp {

    public static String decomp(int n) {
        Map<Integer, Integer> primeCountMap = new TreeMap<>();
        for (int i = 2; i <= n; i++) {
            int num = i;
            for (int prime = 2; prime <= num; prime++) {
                while (num % prime == 0) {
                    num /= prime;
                    primeCountMap.put(prime, primeCountMap.getOrDefault(prime, 0) + 1);
                }
            }
        }
        List<String> primeFactors = new ArrayList<>();
        for (int prime : primeCountMap.keySet()) {
            int count = primeCountMap.get(prime);
            if (count == 1) {
                primeFactors.add(Integer.toString(prime));
            } else {
                primeFactors.add(prime + "^" + count);
            }
        }

        return String.join(" * ", primeFactors);
    }
}
