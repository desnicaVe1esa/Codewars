package kyu_7.bits_battle.java;

public class BitsBattle {
    static String bitsBattle(int[] numbers) {
        int evens = 0;
        int odds = 0;
        for (int num : numbers) {
            if (num == 0) {
                continue;
            }
            if (num % 2 != 0) {
                odds += Integer.bitCount(num);
            } else {
                evens += Integer.toBinaryString(num).length() - Integer.bitCount(num);
            }
        }
        if (odds > evens) {
            return "odds win";
        }
        if (odds < evens) {
            return "evens win";
        }
        return "tie";
    }
}