package kyu_6.locate_p_using_3_points_and_their_distances_to_p.java;

public class Solution {
    public static Point2 triangulate(Point2 A, long dA, Point2 B, long dB, Point2 C, long dC) {
        long A1 = 2 * (B.getX() - A.getX());
        long B1 = 2 * (B.getY() - A.getY());
        long C1 = (dA - dB - (A.getX() * A.getX() - B.getX() * B.getX()) - (A.getY() * A.getY() - B.getY() * B.getY()));

        long A2 = 2 * (C.getX() - A.getX());
        long B2 = 2 * (C.getY() - A.getY());
        long C2 = (dA - dC - (A.getX() * A.getX() - C.getX() * C.getX()) - (A.getY() * A.getY() - C.getY() * C.getY()));

        long det = A1 * B2 - A2 * B1;
        if (det == 0) {
            return null;
        }

        long x = (C1 * B2 - C2 * B1) / det;
        long y = (A1 * C2 - A2 * C1) / det;

        return new Point2(x, y);
    }
}