package kyu_6.pyramid_array.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;


public class SolutionTest {

    @Test
    public void fixedTests() {
        test(0, new int[][]{});
        test(1, new int[][]{{1}});
        test(2, new int[][]{{1}, {1, 1}});
        test(3, new int[][]{{1}, {1, 1}, {1,1,1}});
    }

    private static String pyramidToString(int[][] p) {
        return "{" + Arrays.stream(p)
                .map(row -> "{" + Arrays.stream(row).mapToObj(Integer::toString).collect(Collectors.joining(",")) + "}")
                .collect(Collectors.joining(",")) + "}";
    }

    private void test(int n, int[][] correct) {
        int[][] userSolution = Kata.pyramid(n);
        String scorrect = pyramidToString(correct);
        String suser = pyramidToString(userSolution);
        String text = suser + "\nshould equal:\n" + scorrect + "\n";
        Assert.assertArrayEquals(text,correct, userSolution);
    }
}