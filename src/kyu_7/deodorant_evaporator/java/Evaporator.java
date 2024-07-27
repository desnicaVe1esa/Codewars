package kyu_7.deodorant_evaporator.java;

public class Evaporator {

  public static int evaporator(double content, double evap_per_day, double threshold) {
    int day = 0;
    double total = content;
    while (content >= total * (1d / 100) * threshold) {
      content -= content * (1d / 100) * evap_per_day;
      day++;
    }
    return day;
  }
}

/*
10мл
10% от 10 мл = 1
10% порог = 1 -> распылитель не работает
на выходе 22 -> день, когда испаритель выйдет из строя


 */