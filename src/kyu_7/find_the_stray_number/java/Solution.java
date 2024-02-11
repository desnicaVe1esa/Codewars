package kyu_7.find_the_stray_number.java;

class Solution {
    static int stray(int[] numbers) {
        int compare = numbers[0];
        for(int i = 1; i < numbers.length; i++)
            compare = compare ^ numbers[i];
        return compare;
    }
}
