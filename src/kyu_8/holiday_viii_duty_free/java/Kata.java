package kyu_8.holiday_viii_duty_free.java;

public class Kata {
  public static int dutyFree(int normPrice, int discount, int hol) {
    return (int) (hol / ((double) normPrice / 100 * discount));
  }
}