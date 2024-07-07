#include <stdbool.h>

bool validate(long digits)
{
  int sum = 0, j = 0;
  for (long n = digits; n; n /= 10)
  {
    int d = n % 10;
    if (j++ % 2) d *= 2;
    if (d > 9) d -= 9;
    sum += d;
  }
  return sum % 10 == 0;
}