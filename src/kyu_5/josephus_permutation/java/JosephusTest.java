package kyu_5.josephus_permutation.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JosephusTest {

    @Test
    public void test1() {
        josephusTest(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1, new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    @Test
    public void test2() {
        josephusTest(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2, new Object[]{2, 4, 6, 8, 10, 3, 7, 1, 9, 5});
    }

    @Test
    public void test3() {
        josephusTest(new Object[]{"C", "o", "d", "e", "W", "a", "r", "s"}, 4, new Object[]{"e", "s", "W", "o", "C", "d", "r", "a"});
    }

    @Test
    public void test4() {
        josephusTest(new Object[]{1, 2, 3, 4, 5, 6, 7}, 3, new Object[]{3, 6, 2, 7, 5, 1, 4});
    }

    @Test
    public void test5() {
        josephusTest(new Object[]{}, 3, new Object[]{});
    }

    private void josephusTest(final Object[] items, final int k, final Object[] result) {
        assertThat(Josephus.josephusPermutation(new ArrayList(Arrays.asList(items)), k), is(Arrays.asList(result)));
    }
}