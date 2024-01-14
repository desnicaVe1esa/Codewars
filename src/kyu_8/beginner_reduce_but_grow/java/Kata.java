package kyu_8.beginner_reduce_but_grow.java;

public class Kata {

    public static int grow(int[] x){
        int result = 1;
        for (int i : x) {
            result *= i;
        }
        return result;
    }

}
