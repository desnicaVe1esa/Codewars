package kyu_8.simple_fun_number_1_seats_in_theater.java;

public class Kata {

  public static int seatsInTheater(int nCols, int nRows, int col, int row) {
    return (nCols - col + 1) * (nRows - row);
  }
}