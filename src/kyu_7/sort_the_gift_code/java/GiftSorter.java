package kyu_7.sort_the_gift_code.java;

import java.util.Arrays;

public class GiftSorter {
    public String sortGiftCode(String code) {
        char[] chars = code.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}