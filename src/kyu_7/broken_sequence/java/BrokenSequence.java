package kyu_7.broken_sequence.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BrokenSequence {
    public int findMissingNumber(String sequence) {
        if (sequence.equals("")) {
            return 0;
        }
        String[] strings = sequence.split(" ");
        List<Integer> integerList = new ArrayList<>();
        try {
            for (String string : strings) {
                integerList.add(Integer.parseInt(string));
            }
        } catch (NumberFormatException e) {
            return 1;
        }

        Collections.sort(integerList);

        for (int j = 1; j <= integerList.size(); j++) {
            if (integerList.get(j - 1) != j) {
                return j;
            }
        }

        return 0;
    }
}