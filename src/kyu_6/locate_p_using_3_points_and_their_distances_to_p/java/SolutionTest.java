package kyu_6.locate_p_using_3_points_and_their_distances_to_p.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testSample() {
        assertTriangulate(new Point2(0, 0), new Point2(0, 1), new Point2(1, 0), new Point2(1, 1));
        assertTriangulate(new Point2(0, 1), new Point2(3, 0), new Point2(3, 4), new Point2(0, 4));
        assertTriangulate(new Point2(-1, 0), new Point2(5, 6), new Point2(11, 3), new Point2(1, -4));
        assertTriangulate(new Point2(-100, -100), new Point2(1000, 20), new Point2(0, 0), new Point2(1, 5));
    }

    void assertTriangulate(Point2 A, Point2 B, Point2 C, Point2 P) {
        long dA = sqrDist(A, P);
        long dB = sqrDist(B, P);
        long dC = sqrDist(C, P);

        String signature = String.format(
                "Solution.triangulate(%s, %d, %s, %s, %s, %d)",
                A, dA, B, dB, C, dC);

        assertEquals(P, Solution.triangulate(A, dA, B, dB, C, dC), signature);
    }

    long sqrDist(Point2 A, Point2 B) {
        long deltaX = A.getX() - B.getX();
        long deltaY = A.getY() - B.getY();

        return deltaX * deltaX + deltaY * deltaY;
    }
}

