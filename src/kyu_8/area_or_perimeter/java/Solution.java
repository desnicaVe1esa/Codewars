package kyu_8.area_or_perimeter.java;

public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : (l * 2) + (w * 2);
    }
}
