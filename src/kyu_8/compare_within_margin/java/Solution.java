package kyu_8.compare_within_margin.java;

public class Solution {

  public static int closeCompare(double a, double b) {
    return Double.compare(a, b);
  }

  public static int closeCompare(double a, double b, double margin) {
    return Math.abs(a - b) <= margin ? 0 : a < b ? -1 : 1;
  }
}