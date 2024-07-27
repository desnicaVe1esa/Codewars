int evaporator(double content, double evap_per_day, double threshold) {
    double thresh = content * (threshold / 100);
    int count = 0;
    while (content > thresh) {
      content -= content * (evap_per_day / 100);
      count++;
    }
    return count;
}