package kyu_6.basics_08_find_next_higher_number_with_same_bits_1_s.java;

public class Kata {
    public static int nextHigher(int n) {
        return Integer.parseInt(Integer.toBinaryString(n).replaceAll("0?1(1*)(0*)$", "10$2$1"), 2);
    }
}