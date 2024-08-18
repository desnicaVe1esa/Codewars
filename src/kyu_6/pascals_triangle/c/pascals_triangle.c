void pascals_triangle (unsigned n, unsigned triangle[n * (n + 1) / 2]) {
	int m = 0;
  for (unsigned int i = 0; i < n; i++) {
    unsigned long num = 1;
    for (unsigned int j = 0; j <= i; j++) {
      triangle[m++] = num;
      num = (num * (i-j)) / (j+1);
    }
  }
}