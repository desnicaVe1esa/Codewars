package kyu_8.surface_area_and_volume_of_a_box.java;

public class Kata {
    public static int[] getSize(int w, int h, int d) {
        return new int[] {2 * (d * w + d * h + w * h), w * h * d};
    }
}