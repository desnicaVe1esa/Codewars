package kyu_6.simple_fun_200_luxurious_house.java;

class Solution {
    public static int[] luxhouse(int[] houses) {
        int[] result = new int[houses.length];
        for (int i = 0; i < houses.length; i++) {
            for (int j = i + 1; j < houses.length; j++) {
                while (houses[i] <= houses[j]) {
                    result[i]++;
                    houses[i]++;
                }
            }
        }
        return result;
    }
}
