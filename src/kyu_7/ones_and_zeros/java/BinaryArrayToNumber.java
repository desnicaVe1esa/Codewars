package kyu_7.ones_and_zeros.java;

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder value = new StringBuilder();
        for (Integer integer : binary) {
            value.append(integer);
        }
        return Integer.parseInt(value.toString(), 2);
    }
}
