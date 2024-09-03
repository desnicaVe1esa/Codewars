package kyu_8.the_if_function.java;

public class Kata {
    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        if (bool == null) {
            func2.run();
        }
        if (Boolean.TRUE.equals(bool)) {
            func1.run();
        } else {
            func2.run();
        }
    }
}