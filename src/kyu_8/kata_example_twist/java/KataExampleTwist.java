package kyu_8.kata_example_twist.java;


import java.util.stream.Stream;

public class KataExampleTwist {
    public static String[] kataExampleTwist() {
        return Stream.generate(() -> "codewars").limit(1000).toArray(String[]::new);
    }
}