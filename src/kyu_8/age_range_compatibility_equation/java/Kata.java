package kyu_8.age_range_compatibility_equation.java;

public class Kata{
    public static String datingRange(int age) {
        return age <= 14 ? (int) (age - 0.1 * age) + "-" + (int) (age + 0.1 * age)
                : age / 2 + 7 + "-" + (age - 7) * 2;
    }
}
