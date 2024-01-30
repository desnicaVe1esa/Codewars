package kyu_6.rectangle_into_squares.java;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        while (lng * wdth > 0) {
            if (lng > wdth) {
                result.add(wdth);
                lng = lng - wdth;
            } else {
                result.add(lng);
                wdth = wdth - lng;
            }
        }
        return result;
    }
}
