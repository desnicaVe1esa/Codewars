package kyu_6.locate_p_using_3_points_and_their_distances_to_p.java;

import java.util.Objects;

public class Point2 {

    private long X;
    private long Y;

    public Point2(long X, long Y) {
        this.X = X;
        this.Y = Y;
    }

    public long getX() {
        return X;
    }

    public long getY() {
        return Y;
    }

    public void setX(long x) {
        X = x;
    }

    public void setY(long y) {
        Y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2 point2 = (Point2) o;
        return X == point2.X && Y == point2.Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }

    @Override
    public String toString() {
        return "Point2{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
