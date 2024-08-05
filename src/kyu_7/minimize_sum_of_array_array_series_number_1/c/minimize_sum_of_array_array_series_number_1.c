int cmpfunc(const void *a, const void *b) {
  return *((int *)a) - *((int *)b);
}
int minSum(int a[], int n) {
  qsort(a, n, sizeof(int), cmpfunc);
  int result = 0;
  for (int i = 0; i < n / 2; i++) result += a[i] * a[n - 1 - i];
  return result;
}