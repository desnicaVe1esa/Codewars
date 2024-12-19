package kyu_7.binary_sxore.java;

import java.math.BigInteger;

public class BinarySxore {
    public static BigInteger sxore(BigInteger n) {
        return
                switch (n.mod(BigInteger.valueOf(4)).intValue()) {
                    case 0 -> n;
                    case 1 -> BigInteger.ONE;
                    case 2 -> n.add(BigInteger.ONE);
                    default -> BigInteger.ZERO;
                };
    }
}
