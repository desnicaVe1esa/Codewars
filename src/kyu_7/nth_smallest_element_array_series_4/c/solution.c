int intComparator(int *a, int*b) {
  return *a - *b;
}

int nth_smallest(const int *arr, int count, int n) {
  int buf[count];
  memcpy(buf, arr, count * sizeof(int));
  qsort(buf, count, sizeof(int), intComparator);
  return buf[n-1];
}