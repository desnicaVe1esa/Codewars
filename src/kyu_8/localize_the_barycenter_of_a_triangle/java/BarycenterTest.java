package kyu_8.localize_the_barycenter_of_a_triangle.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BarycenterTest {

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[8.6667, 6.6667]", Arrays.toString(Barycenter.barTriang(
                new double[]{4,6}, new double[]{12,4}, new double[]{10,10})));
        assertEquals("[7.3333, 4.6667]", Arrays.toString(Barycenter.barTriang(
                new double[]{4,2}, new double[]{12,2}, new double[]{6,10})));

    }
}
