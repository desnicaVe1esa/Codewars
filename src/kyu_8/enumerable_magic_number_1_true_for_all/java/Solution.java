package kyu_8.enumerable_magic_number_1_true_for_all.java;


import java.util.function.IntPredicate;

public class Solution{
    public static boolean all(int[] list, IntPredicate predicate){
        for (int j : list) {
            if (!predicate.test(j)) {
                return false;
            }
        }
        return true;
    }
}