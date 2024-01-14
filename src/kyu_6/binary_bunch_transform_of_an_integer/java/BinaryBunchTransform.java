package kyu_6.binary_bunch_transform_of_an_integer.java;

import java.util.Comparator;
import java.util.stream.IntStream;

public class BinaryBunchTransform {
    public static int bunchIt(int number) {
        int x = (1 << Integer.bitCount(number)) - 1;
        return IntStream.range(0, 32)
                .mapToObj(i -> x << i)
                .max(Comparator.comparing(v -> Integer.bitCount(v & number)))
                .orElse(-1);
    }
}
