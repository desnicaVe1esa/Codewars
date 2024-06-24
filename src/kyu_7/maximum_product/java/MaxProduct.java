package kyu_7.maximum_product.java;

import java.util.ArrayList;
import java.util.List;

public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        List<Integer> prepared = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            try {
                prepared.add(array[i] * array[i + 1]);
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return prepared.stream().max(Integer::compare).get();
    }
}