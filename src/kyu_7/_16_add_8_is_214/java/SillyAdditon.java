package kyu_7._16_add_8_is_214.java;

public class SillyAdditon {

    public static int add(int num1,int num2){
        StringBuilder result = new StringBuilder();
        while (num1 >= 1 || num2 >= 1) {
            result.insert(0, num1 % 10 + num2 % 10);
            num1 /= 10;
            num2 /= 10;
        }
        if (result.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(result.toString());
    }
}

