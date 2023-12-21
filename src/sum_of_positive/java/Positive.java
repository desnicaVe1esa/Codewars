package sum_of_positive.java;

import java.util.Arrays;

public class Positive{

    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(f -> f >= 0).sum();
    }
}
