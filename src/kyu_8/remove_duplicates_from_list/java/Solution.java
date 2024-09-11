package kyu_8.remove_duplicates_from_list.java;

import java.util.Arrays;

public class Solution {
    public static int[] distinct(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }
}
