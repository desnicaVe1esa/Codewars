package kyu_6.are_they_the_same.groovy

import static org.junit.Assert.*;
import org.junit.Test;

public class AreSameTest {

    @Test
    public void basicTests() {
        int[] a1 = [121, 144, 19, 161, 19, 144, 19, 11]
        int[] a2 = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
        assertEquals(true, AreSame.comp(a1, a2))
        a1 = [121, 144, 19, 161, 19, 144, 19, 11]
        a2 = [11*21, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
        assertEquals(false, AreSame.comp(a1, a2))

    }
}
