package kyu_6.primorial_of_a_number.java;

import java.math.BigInteger;

public class Primorial {
    public static String numPrimorial(int n) {
        BigInteger result = BigInteger.ONE;
        int counter = 0;
        for (BigInteger i = BigInteger.ONE; true; i = i.add(BigInteger.ONE)) {
            if(counter == n) {
                break;
            }
            if (isPrime(i)) {
                result = result.multiply(i);
                counter++;
            }
        }
        return result + "";
    }

    public static boolean isPrime (BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }
        for (BigInteger i = BigInteger.TWO; i.pow(2).compareTo(n) <= 0 ; i = i.add(BigInteger.ONE)) {
            if (n.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }
}
