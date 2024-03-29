package kyu_5.weight_for_weight.java;

import java.util.*;

public class WeightSort {
    public static String orderWeight(String strng) {
        String[] weights = strng.split(" ");
        Arrays.sort(weights, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int v1 = 0;
                for (int i = 0; i < s1.length(); i++) {
                    int valor = (int) s1.charAt(i) - 48;
                    if (valor <= 9) {
                        v1 += valor;
                    }
                }
                int v2 = 0;
                for (int i = 0; i < s2.length(); i++) {
                    int valor = (int) s2.charAt(i) - 48;
                    if (valor <= 9) {
                        v2 += valor;
                    }
                }
                if (v1 - v2 == 0) {
                    return s1.compareTo(s2);
                }

                return v1 - v2;
            }
        });
        return String.join(" ", weights);
    }
}