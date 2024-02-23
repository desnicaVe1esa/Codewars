package kyu_8.lario_and_muigi_pipe_problem.java;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        int start = numbers[0];
        int end = numbers[numbers.length - 1];
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(i);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}