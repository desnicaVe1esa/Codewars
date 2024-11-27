package kyu_8.closest_elevator.java;

import java.lang.Math;

public class Elevator {
    public static String call(int left, int right, int call){
        return Math.abs(left - call) < Math.abs(right - call) ? "left" : "right";
    }
}
