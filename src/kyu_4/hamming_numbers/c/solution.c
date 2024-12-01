#include <stdint.h>

#define min(a,b) (((a)<(b))?(a):(b))

uint64_t hamber(int n)
{
  uint64_t h[n];

  h[0] = 1;

  uint64_t x2 = 2, x3 = 3, x5 = 5;

  int i = 0, j = 0, k = 0;

  for(int idx = 1; idx < n; idx++)
  {
    h[idx] = min(x2, min(x3,x5));
    if(h[idx] == x2) x2 = 2 * h[++i];
    if(h[idx] == x3) x3 = 3 * h[++j];
    if(h[idx] == x5) x5 = 5 * h[++k];
  }

  return h[n-1];
}