package kyu_6.even_fusc_fun.java;

import org.junit.Assert;
import org.junit.Test;

public class FuscFunTest {
    @Test
    public void closestEvenFusc() {
        Assert.assertEquals(3, FuscFun.closestEvenFusc(1));
        Assert.assertEquals(3, FuscFun.closestEvenFusc(2));
        Assert.assertEquals(3, FuscFun.closestEvenFusc(3));
        Assert.assertEquals(6, FuscFun.closestEvenFusc(4));
    }
}