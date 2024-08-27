#include <stdlib.h>
#include <string.h>

char *digits_explode (const char *d)
{
  char *res = calloc(9 * strlen(d) + 1, 1), *r = res;
  for (int n; *d; d++, r += n) memset(r, *d, n = *d - '0');
  return res;
}