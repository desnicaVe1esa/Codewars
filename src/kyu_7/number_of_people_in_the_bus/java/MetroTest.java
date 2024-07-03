package kyu_7.number_of_people_in_the_bus.java;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class MetroTest {
    Metro metro = new Metro();

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, metro.countPassengers(list));
    }


}