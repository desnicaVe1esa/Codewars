package kyu_7.testing_1_2_3.java;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        int count = 1;
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            result.add(count + ": " + line);
            count++;
        }
        return result;
    }
}