#include <stddef.h>

int mxdiflg(
  const char **str1, size_t len1,
  const char **str2, size_t len2)
{
  size_t i = 0;
  size_t j = 0;
  int bestlen = 0;
  int newlen = 0;

  if (len1 <= 0 || len2 <= 0)
    return (-1);
  while (i < len1)
  {
    j = 0;
    while (j < len2)
    {
      newlen = strlen(str1[i]) - strlen(str2[j]);
      if (newlen < 0)
        newlen = -newlen;
      if (bestlen < newlen)
        bestlen = newlen;
      j++;
    }
    i++;
  }
  return (bestlen);
}