package kyu_5.odd_even_big_fusc_fun.java;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class BigFuscFunTest {
    @Test
    public void closestFusc() throws Exception {
        Assert.assertEquals( BigInteger.valueOf( 3L ), BigFuscFun.closestFusc( BigInteger.ONE, true ) );
        Assert.assertEquals( BigInteger.valueOf( 3L ), BigFuscFun.closestFusc( BigInteger.valueOf( 2L ), true ) );
        Assert.assertEquals( BigInteger.valueOf( 4L ), BigFuscFun.closestFusc( BigInteger.valueOf( 3L ), false ) );
        Assert.assertEquals( BigInteger.valueOf( 4L ), BigFuscFun.closestFusc( BigInteger.valueOf( 4L ), false ) );
    }
}
