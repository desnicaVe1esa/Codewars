package kyu_5.odd_even_big_fusc_fun.java;

import java.math.BigInteger;

public class BigFuscFun {

    private static BigInteger THREE = new BigInteger("3");

    public static BigInteger closestFusc(BigInteger n, boolean isEven) {
        BigInteger mod = n.remainder(THREE);
        return isEven ? mod.equals(BigInteger.ZERO)  ? n : n.add(THREE).subtract(mod)
                : !mod.equals(BigInteger.ZERO) ? n : n.add(BigInteger.ONE);
    }
}