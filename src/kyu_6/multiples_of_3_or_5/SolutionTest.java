package kyu_6.multiples_of_3_or_5;

import static org.junit.Assert.*;
import org.junit.Test;
import multiples_of_3_or_5.*; // Заглушка от ошибки

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }

}

