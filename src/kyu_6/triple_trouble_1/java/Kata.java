package kyu_6.triple_trouble_1.java;

public class Kata {
    public static int TripleDouble(long num1, long num2) {
        String n1str = String.valueOf(num1);
        String n2str = String.valueOf(num2);
        for(int i = 0; i < 10; i++) {
            String n = String.valueOf(i);
            if(n1str.contains(n+n+n) && n2str.contains(n+n)) {
                return 1;
            }
        }
        return 0;
    }
}