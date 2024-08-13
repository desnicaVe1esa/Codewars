cmp(*p, *q)
{
  return *q - *p;
}

maxTriSum(arr[], n)
{
  qsort(arr, n, sizeof(int), cmp);
  int a = 0, b, c;
  for (b = a + 1; arr[b] == arr[a]; b++);
  for (c = b + 1; arr[c] == arr[b]; c++);
  return arr[a] + arr[b] + arr[c];
}