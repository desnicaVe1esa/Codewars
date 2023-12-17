package get_the_mean_of_an_array.java;

import java.util.stream.IntStream;

public class School{

    public static int getAverage(int[] marks){
        int sum = IntStream.of(marks).sum();
        return sum / marks.length;
    }

}
