package kyu_8.sum_mixed_array.java;

import java.util.List;

public class Solution {
    public int sum(List<?> mixed) {
        return mixed.stream().map(m -> Integer.parseInt(String.valueOf(m))).reduce(Integer::sum).get();
    }
}