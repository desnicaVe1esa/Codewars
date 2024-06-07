package kyu_6.make_the_deadfish_swim.java;

import java.util.stream.Stream;

public class DeadFish {
    public static int[] parse(String data) {
        int[] result = new int[Stream.of(data.split("")).filter(f -> f.equals("o")).toList().size()];
        int digit = 0;
        int it = 0;
        for (int i = 0; i < data.length(); i++) {
            switch (data.charAt(i)) {
                case 'i' ->  digit++;
                case 'd' ->  digit--;
                case 's' ->  digit *= digit;
                case 'o' ->  {
                    result[it] = digit;
                    it++;
                }
            }
        }
        return result;
    }
}
