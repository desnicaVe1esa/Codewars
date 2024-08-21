package kyu_7.the_office_iii_broken_photocopier.java;

public class Kata {

  public static String broken(final String x) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < x.length(); i++) {
      result.append(x.charAt(i) == '0' ? "1" : "0");
    }
    return result.toString();
  }
}