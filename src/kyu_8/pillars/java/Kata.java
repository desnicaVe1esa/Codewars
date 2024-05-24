package kyu_8.pillars.java;

public class Kata{

  public static int pillars(int numPill, int dist, int width){
    return numPill < 2 ? 0 : numPill == 2 ? dist * 100 : (dist * 100 * (numPill - 1)) + (width * (numPill - 2));
  }

}