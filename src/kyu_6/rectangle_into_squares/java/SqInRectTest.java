package kyu_6.rectangle_into_squares.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class SqInRectTest {

    @Test
    public void test1() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), SqInRect.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(null, SqInRect.sqInRect(5, 5));
    }
}
