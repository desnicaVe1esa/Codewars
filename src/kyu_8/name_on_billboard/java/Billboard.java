package kyu_8.name_on_billboard.java;

public class Billboard {
    public static int billboard(String name, int price) {
        int result = 0;
        for (int i = 0; i < price; i++) {
            result += name.length();
        }
        return result;
    }
}