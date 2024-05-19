package kyu_6.multiplication_table.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ExampleTest {
    @Test
    @DisplayName("n = 3")
    void test3() {
        int[][] test = {{1,2,3},{2,4,6},{3,6,9}};
        assertArrayEquals(test,Multiplication.multiplicationTable(3));
    }
    @Test
    @DisplayName("n = 1")
    void test1(){
        int[][] test1 = {{1}};
        assertArrayEquals(test1, Multiplication.multiplicationTable(1));
    }
}
