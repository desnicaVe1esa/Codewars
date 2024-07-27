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