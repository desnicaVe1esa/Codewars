package kyu_7.multiplication_generators_2.java;

public class Generator {

    private final int a;
    private int num = 0;

    private Generator(int a) {
        this.a = a;
    }

    public static Generator of(int a) {
        return new Generator( a );
    }

    public String next() {
        num++;
        return a + " x " + num + " = " + a * num;
    }
}
