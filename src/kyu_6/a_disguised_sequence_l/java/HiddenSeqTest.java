package kyu_6.a_disguised_sequence_l.java;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class HiddenSeqTest {

    private static void testing(BigInteger actual, BigInteger expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: fcn");
        testing(HiddenSeq.fcn(17), BigInteger.valueOf(131072));
        testing(HiddenSeq.fcn(21), BigInteger.valueOf(2097152));
        testing(HiddenSeq.fcn(14), BigInteger.valueOf(16384));
        testing(HiddenSeq.fcn(43), BigInteger.valueOf(8796093022208L));
        testing(HiddenSeq.fcn(19), BigInteger.valueOf(524288));

    }

}
