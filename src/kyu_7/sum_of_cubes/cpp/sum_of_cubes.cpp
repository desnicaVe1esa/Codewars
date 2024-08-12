unsigned int sum_cubes(unsigned int n) {
      long result = 0;
      for (long i = 1; i <= n; i++) {
        result += i * i * i;
      }
      return result;
}