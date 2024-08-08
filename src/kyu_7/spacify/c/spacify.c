#include <stdlib.h>3
char *spacify(const char *str_in) {5
  char *s = calloc(1, strlen(str_in)*2 + 1), *st = s;
  for (;*str_in;*s++ = *str_in++,*s++ = ' ');
  return *(--s) = '\0', st;
}