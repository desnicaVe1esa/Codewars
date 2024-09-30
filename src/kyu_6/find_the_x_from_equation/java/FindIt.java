package kyu_6.find_the_x_from_equation.java;

import java.math.BigInteger;

public class FindIt {
    public int findIt(String s) {
        String[] ints = s.split("[^0-9]+");
        BigInteger mult = new BigInteger(ints[0]);
        BigInteger mod = new BigInteger(ints[2]);
        try {
            return mult.modInverse(mod).intValue();
        }
        catch (ArithmeticException e) {
            return -1;
        }
    }
}